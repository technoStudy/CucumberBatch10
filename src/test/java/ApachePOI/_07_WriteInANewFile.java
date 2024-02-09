package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteInANewFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\ragip\\Desktop\\ApachePOI\\WriteInToANewFile.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook(); // Creates a temporary file in the memory
        XSSFSheet sheet = workbook.createSheet("My Sheet"); // Creates a sheet in the temporary file



        // This also works for existing files

        Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello Batch 10!");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
    }
}
