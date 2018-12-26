package file.comparator.dao;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ExcelReaderDao {

   public Map<String,String> excelReader(InputStream inputStream) throws IOException {

       Map<String,String> excelMap = new TreeMap<String, String>();

        XSSFWorkbook excel = new XSSFWorkbook(inputStream);
        XSSFSheet sheetExcel = excel.getSheetAt(0); // change index of sheet
        XSSFRow row;
        int i = 1;// start from rowNumber

        for( ; i<sheetExcel.getLastRowNum()+1; i++){
            row = sheetExcel.getRow(i);
            String key = row.getCell(0).getRawValue(); // Set column number

            int colNum = row.getLastCellNum();
            int j = 2; // Set second column nubmer for iterate

            for (; j<colNum; j++){
                String value = row.getCell(j).getRawValue();
                if(value.matches(".[+-]?\\d+")) { // delete minus
                    value = value.substring(1,value.length());
                }
                excelMap.put(key,value);
            }
        }
      return excelMap;
    }
}