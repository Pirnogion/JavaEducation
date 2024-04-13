package lr10;

import org.jsoup.Jsoup;

public class Example5 {
    public static void main(String[] args) {
        var url = "https://itlearn.ru/first-steps";
        try {
            var document = Jsoup.connect(url).get();
            var links = document.select("a[href]");
            for (var link: links) {
                System.out.println(link.attr("abs:href"));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
