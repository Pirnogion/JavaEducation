package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Example4 {
    public static void main(String[] args) {
        try {
            var parser = new JSONParser();
            var object = (JSONObject)parser.parse(new FileReader("src/lr10/inout/example3.json"));

            System.out.println("[Корневой элемент] " + object.keySet().iterator().next());

            var array = (JSONArray)object.get("books");
            for (var element: array) {
                var book = (JSONObject)element;
                System.out.format("[Книга] Название: %s, Автор: %s, Год: %s.\n", book.get("title"), book.get("author"), book.get("year"));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
