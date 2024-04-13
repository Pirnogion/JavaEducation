package lr10;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Example7 {
    public static void main(String[] args) {
        try {
            var path = "src/lr10/inout/example6.xlsx";
            var fileInputStream = new FileInputStream(path);

            var workbook = new XSSFWorkbook(fileInputStream);
            var sheet = workbook.getSheet("Товары");

            for (var row: sheet) {
                for (var cell: row) {
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }

            workbook.close();
            fileInputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
