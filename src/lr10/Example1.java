package lr10;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try {
            var builderFactory = DocumentBuilderFactory.newInstance();
            var documentBuilder = builderFactory.newDocumentBuilder();
            var document = documentBuilder.newDocument();

            var objects = document.createElement("objects");
            objects.setAttribute("size", "3");

            var car = document.createElement("car");
            car.setTextContent("a032aa77rus");

            var house = document.createElement("house");
            house.setTextContent("Old, wooden.");

            var mouse = document.createElement("mouse");
            mouse.setTextContent("In the house.");

            objects.appendChild(car);
            objects.appendChild(house);
            objects.appendChild(mouse);
            document.appendChild(objects);

            document.setXmlStandalone(true);
            document.normalizeDocument();

            var transformerFactory = TransformerFactory.newInstance();

            var transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            var domSource = new DOMSource(document);
            var streamResult = new StreamResult(new File("src/lr10/inout/example1.xml"));

            transformer.transform(domSource, streamResult);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
