package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInDifferentRow {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\ragip\\Desktop\\ApachePOI\\WriteIntoExistingFile.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path); // creates a connection FROM file To our code
        Workbook workbook = WorkbookFactory.create(fileInputStream); // opens a copy of the file in the temporary memory
        Sheet sheet = workbook.getSheet("Sheet1");

        int numberOfRows = sheet.getPhysicalNumberOfRows();

        Row row = sheet.createRow(numberOfRows);

        for (int i = 0; i < 10; i++) {
            Cell cell1 = row.createCell(i);
            cell1.setCellValue("Hello Batch 10!");
        }

        FileOutputStream fileOutputStream = new FileOutputStream(path); // creates a connection FROM our code To the file
        workbook.write(fileOutputStream); // Writes in the file
        workbook.close();
        fileOutputStream.close();
    }
}
