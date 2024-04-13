package lr10;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class Example6 {
    public static void main(String[] args) {
        try {
            var workbook = new XSSFWorkbook();
            var sheet = workbook.createSheet("Товары");

            var headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Товар");
            headerRow.createCell(1).setCellValue("Характеристики");
            headerRow.createCell(2).setCellValue("Стоимость");

            var dataRow1 = sheet.createRow(1);
            dataRow1.createCell(0).setCellValue("Книга");
            dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
            dataRow1.createCell(2).setCellValue(500.0);

            var dataRow2 = sheet.createRow(2);
            dataRow2.createCell(0).setCellValue("Компьютер");
            dataRow2.createCell(1).setCellValue("Процессор: Intel Core 15, Оперативная память: 512MB");
            dataRow2.createCell(2).setCellValue(25000.0);

            var path = "src/lr10/inout/example6.xlsx";
            var fileOutputStream = new FileOutputStream(path);
            workbook.write(fileOutputStream);
            workbook.close();
            fileOutputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
