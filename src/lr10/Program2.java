package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;

public class Program2 {
    public static final String path = "src/lr10/inout/program2.json";

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
            var document = JsonDocument.open();
            if (document == null) {
                System.err.println("Не удалось открыть документ.");
                return;
            }

            var tasks = (JSONArray)document.get("list");
            for (int i = 0; i < tasks.size(); ++i) {
                var task = (JSONObject)tasks.get(i);
                var title = task.get("title");

                if (value.equals(title)) {
                    System.out.println("Указанная задача удалена.");
                    tasks.remove(i);
                    break;
                }
            }

            JsonDocument.save(document);
        }
    }

    static class WriteCommand {
        public static void writeTask(String title, String status) {
            var document = JsonDocument.open();
            if (document == null) {
                System.err.println("Не удалось открыть документ.");
                return;
            }

            var tasks = (JSONArray)document.get("list");

            var task = new JSONObject();
            task.put("title", title);
            task.put("status", status);

            tasks.add(task);

            JsonDocument.save(document);
        }
    }

    static class ReadCommand {
        public static void readAll() {
            var document = JsonDocument.open();
            if (document == null) {
                System.err.println("Не удалось открыть документ.");
                return;
            }

            var tasks = (JSONArray)document.get("list");
            for (int i = 0; i < tasks.size(); ++i) {
                var task = (JSONObject)tasks.get(i);

                var title = task.get("title");
                var status = task.get("status");

                System.out.format("[Название: %s; Статус: %s;]\n", title, status);
            }
        }

        public static void readByTitle(String value) {
            var document = JsonDocument.open();
            if (document == null) {
                System.err.println("Не удалось открыть документ.");
                return;
            }

            var tasks = (JSONArray)document.get("list");
            for (int i = 0; i < tasks.size(); ++i) {
                var task = (JSONObject)tasks.get(i);

                var title = task.get("title");
                var status = task.get("status");

                if (value.equals(title)) {
                    System.out.format("[Название: %s; Статус: %s;]\n", title, status);
                }
            }
        }

        public static void readByStatus(String value) {
            var document = JsonDocument.open();
            if (document == null) {
                System.err.println("Не удалось открыть документ.");
                return;
            }

            var tasks = (JSONArray)document.get("list");
            for (int i = 0; i < tasks.size(); ++i) {
                var task = (JSONObject)tasks.get(i);

                var title = task.get("title");
                var status = task.get("status");

                if (value.equals(status)) {
                    System.out.format("[Название: %s; Статус: %s;]\n", title, status);
                }
            }
        }
    }

    static class JsonDocument {
        public static JSONObject open() {
            try {
                var parser = new JSONParser();
                return (JSONObject)parser.parse(new FileReader(path));
            } catch (Exception exception) {
                exception.printStackTrace();
            }

            return null;
        }

        public static void save(JSONObject document) {
            try (FileWriter writer = new FileWriter(path)) {
                writer.write(document.toJSONString());
            }  catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
