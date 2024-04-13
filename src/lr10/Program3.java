package lr10;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Program3 {
    public static final String url = "https://itlearn.ru/first-steps";
    public static final String path = "src/lr10/inout/program3.txt";

    public static void main(String[] args) {
        try {
            var stream = new DataOutputStream(new FileOutputStream(path));

            Document document = null;

            int attempt = 0;
            while (attempt++ < 3) {
                try {
                    document = Jsoup.connect(url).get();
                } catch (HttpStatusException exception) {
                    System.err.format("Попытка %s. Ошибка запроса HTTP.", attempt);
                    exception.printStackTrace();
                }
            }

            if (document != null) {
                var links = document.select("a[href]");
                for (var link: links) {
                    stream.writeUTF(link.attr("abs:href"));
                    stream.writeChar('\n');
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
