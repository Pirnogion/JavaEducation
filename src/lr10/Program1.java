package lr10;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Program1 {
    public static final String path = "src/lr10/inout/program1.xml";

    public static void main(String[] args) {
        if (args.length == 0 || "read".equals(args[0]) && "all".equals(args[1])) {
            ReadCommand.readAll();
        }

        if (args.length == 3 && "read".equals(args[0])) {
            switch (args[1]) {
                case "title" -> ReadCommand.readByTitle(args[2]);
                case "status" -> ReadCommand.readByStatus(args[2]);
                default -> System.err.println("Неизвестное поле.");
            }
        }

        if (args.length == 3 && "create".equals(args[0])) {
            WriteCommand.writeTask(args[1], args[2]);
        }

        if (args.length == 2 && "delete".equals(args[0])) {
            DeleteCommand.deleteTask(args[1]);
        }
    }

    static class DeleteCommand {
        public static void deleteTask(String value) {
            var document = XmlDocument.open();
            if (document == null) {
                System.err.println("Не удалось открыть документ.");
                return;
            }

            var list = document.getDocumentElement();
            var tasks = list.getChildNodes();
            for (int i = 0; i < tasks.getLength(); ++i) {
                var elements = tasks.item(i);
                if ("task".equals(elements.getNodeName())) {
                    var properties = elements.getChildNodes();
                    var title = properties.item(0).getTextContent();

                    if (value.equals(title)) {
                        System.out.println("Указанная задача удалена.");
                        elements.getParentNode().removeChild(elements);
                    }
                }
            }

            XmlDocument.save(document);
        }
    }

    static class WriteCommand {
        public static void writeTask(String title, String status) {
            var document = XmlDocument.open();
            if (document == null) {
                System.err.println("Не удалось открыть документ.");
                return;
            }

            var task = document.getDocumentElement().appendChild( document.createElement("task") );
            task.appendChild( document.createElement("title") ).setTextContent(title);
            task.appendChild( document.createElement("status") ).setTextContent(status);

            XmlDocument.save(document);
        }
    }

    static class ReadCommand {
        public static void readAll() {
            var document = XmlDocument.open();
            if (document == null) {
                System.err.println("Не удалось открыть документ.");
                return;
            }

            var tasks = document.getDocumentElement().getChildNodes();
            for (int i = 0; i < tasks.getLength(); ++i) {
                var elements = tasks.item(i);
                if ("task".equals(elements.getNodeName())) {
                    var properties = elements.getChildNodes();
                    var title = properties.item(0).getTextContent();
                    var status = properties.item(1).getTextContent();

                    System.out.format("[Название: %s; Статус: %s;]\n", title, status);
                }
            }
        }

        public static void readByTitle(String value) {
            var document = XmlDocument.open();
            if (document == null) {
                System.err.println("Не удалось открыть документ.");
                return;
            }

            var tasks = document.getDocumentElement().getChildNodes();
            for (int i = 0; i < tasks.getLength(); ++i) {
                var elements = tasks.item(i);
                if ("task".equals(elements.getNodeName())) {
                    var properties = elements.getChildNodes();
                    var title = properties.item(0).getTextContent();
                    var status = properties.item(1).getTextContent();

                    if (value.equals(title)) {
                        System.out.format("[Название: %s; Статус: %s;]\n", title, status);
                    }
                }
            }
        }

        public static void readByStatus(String value) {
            var document = XmlDocument.open();
            if (document == null) {
                System.err.println("Не удалось открыть документ.");
                return;
            }

            var tasks = document.getDocumentElement().getChildNodes();
            for (int i = 0; i < tasks.getLength(); ++i) {
                var elements = tasks.item(i);
                if ("task".equals(elements.getNodeName())) {
                    var properties = elements.getChildNodes();
                    var title = properties.item(0).getTextContent();
                    var status = properties.item(1).getTextContent();

                    if (value.equals(status)) {
                        System.out.format("[Название: %s; Статус: %s;]\n", title, status);
                    }
                }
            }
        }
    }

    static class XmlDocument {
        public static Document open() {
            try {
                var document = DocumentBuilderFactory
                        .newInstance()
                        .newDocumentBuilder()
                        .parse(new File(path));

                document.getDocumentElement().normalize();

                return document;
            } catch (Exception exception) {
                exception.printStackTrace();
            }

            return null;
        }

        public static void save(Document document) {
            document.normalizeDocument();

            try {
                var transformer = TransformerFactory.newInstance().newTransformer();
                var domSource = new DOMSource(document);
                var streamResult = new StreamResult(new File(path));
                transformer.transform(domSource, streamResult);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
