package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _05_WriteIntoAnExistingFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\ragip\\Desktop\\ApachePOI\\WriteIntoExistingFile.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path); // creates a connection FROM file To our code
        Workbook workbook = WorkbookFactory.create(fileInputStream); // opens a copy of the file in the temporary memory
        Sheet sheet = workbook.getSheet("Sheet1");

        Row row = sheet.createRow(0); // Creates the row we want to write in
        Cell cell = row.createCell(0); // Creates the cell we want to write in
        cell.setCellValue("Hello Batch 10!"); // Sets the value in the cell

        for (int i = 1; i < 10; i++) {
            Cell cell1 = row.createCell(i);
            cell1.setCellValue("Hello Batch 10!");
        }

        FileOutputStream fileOutputStream = new FileOutputStream(path); // creates a connection FROM our code To the file
        workbook.write(fileOutputStream); // Writes in the file
        workbook.close();
        fileOutputStream.close();
    }
}
