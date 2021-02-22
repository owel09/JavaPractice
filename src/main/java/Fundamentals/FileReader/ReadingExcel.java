package Fundamentals.FileReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcel {

    public static void main(String[] args) throws IOException {

        //PATH FOR EXCEL
        String excelFilePath = "src/test/resources/CardDetails.xlsx";

        //OPEN THE FILE IN READING MODE
        FileInputStream fileInputStream = new FileInputStream(excelFilePath);

        //OBJECT VARIABLE FOR THE WORKBOOK
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        //creating sheet object to retrieve object
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

        //evaluating cell type
        FormulaEvaluator formulaEvaluator = xssfWorkbook.getCreationHelper().createFormulaEvaluator();

        //iteration over row
        for(Row row : xssfSheet){
            //iteration over cell
            for (Cell cell : row){
                switch (formulaEvaluator.evaluateInCell(cell).getCellType()){
                    //getting value of numeric
                    //\t - insert tab ito between data
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()+ "\t\t");
                        break;
                    //getting value of string
                    case STRING:
                        System.out.print(cell.getStringCellValue()+ "\t\t");
                        break;
                }
            }
            System.out.println();

        }
    }
}
