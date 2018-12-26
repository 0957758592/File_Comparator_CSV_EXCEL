package file.comparator.service;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.*;

public class WriteComparedFile {

    public void createExcel(Map<String,Object> data ) {
       XSSFWorkbook workbook = new XSSFWorkbook();
       XSSFSheet sheet = workbook.createSheet("compared");
       Integer key = 0;

//        for (Map.Entry<Object, Object> comparedData : map.entrySet()) {
//            key++;
//            data.put(key,map);
//        }

        System.out.println("fileFriter: " + data.toString());
    }


}
