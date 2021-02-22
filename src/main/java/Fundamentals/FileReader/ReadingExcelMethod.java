package Fundamentals.FileReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelMethod {

    public static void main(String[] args) {

        ReadingExcelMethod rc = new ReadingExcelMethod();

        String printOutput = rc.excelOutput(1,0);
        System.out.println(printOutput);

    }

    public String excelOutput(int vRow, int vColumn) {

    String cellValue = null; //initialize variable to store cell
    Workbook workbook = null; //initialize workbook

        try{
            //read the data from a file in a form of bytes
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/CardDetails.xlsx");

            //construct XSSFWorkbook object by buffering the whole stream in the memory
            workbook = new XSSFWorkbook(fileInputStream);

        } catch (IOException e) { //catch clause for fileInputStream and workbook
            e.printStackTrace();
        }

        Sheet sheet = workbook.getSheetAt(0); //getting XSSFSheet object at given index
        Row row = sheet.getRow(vRow); //returns logical row
        Cell cell = row.getCell(vColumn); //getting the cell representing the given column
        cellValue = cell.getStringCellValue(); //getting cell value

        return cellValue;

    }

}
