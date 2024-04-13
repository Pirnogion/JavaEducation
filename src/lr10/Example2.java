package lr10;

import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Example2 {
    public static void main(String[] args) {
        try {
            var file = new File("src/lr10/inout/example1.xml");
            var builderFactory = DocumentBuilderFactory.newInstance();
            var documentBuilder = builderFactory.newDocumentBuilder();

            var document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();

            System.out.println("[Корневой элемент] " + document.getDocumentElement().getNodeName());
            var nodes = document.getDocumentElement().getChildNodes();
            for (int i = 0; i < nodes.getLength(); ++i) {
                var node = nodes.item(i);
                if (node.getNodeType() != Node.TEXT_NODE) {
                    System.out.println("[Элемент] " + node.getNodeName() + ": \"" + node.getTextContent() + "\"");
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
