package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class Example3 {
    public static void main(String[] args) {
        try {
            var library = new JSONObject();
            var books = new JSONArray();

            var book1 = new JSONObject();
            book1.put("title", "Война и Мир");
            book1.put("author", "Лев Толстой");
            book1.put("year", "1869");

            var book2 = new JSONObject();
            book2.put("title", "Мастер и Маргарита");
            book2.put("author", "Мизаил Булгаков");
            book2.put("year", "1967");

            books.add(book1);
            books.add(book2);

            library.put("books", books);

            try (FileWriter writer = new FileWriter("src/lr10/inout/example3.json")) {
                writer.write(library.toJSONString());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
