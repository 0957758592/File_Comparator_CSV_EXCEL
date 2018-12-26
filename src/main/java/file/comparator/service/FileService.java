package file.comparator.service;

import file.comparator.dao.CsvReaderDao;
import file.comparator.dao.ExcelReaderDao;
import org.apache.commons.fileupload.FileItem;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class FileService {
    FileComparator fileComparator;
    InputStream inputStream = null;
    ExcelReaderDao excelReader = new ExcelReaderDao();
    CsvReaderDao csvReader = new CsvReaderDao();
    Map<String, String> excel;
    Map<String, String> csv;

    public void compare(List<FileItem> items) throws IOException {
        for (FileItem item : items) {
            if (!item.isFormField()) {
                inputStream = item.getInputStream();

                if (item.getFieldName().equals("xlsx")){
                    excel = excelReader.excelReader(inputStream);
                }
                if (item.getFieldName().equals("csv")){
                    csv = csvReader.csvReader(inputStream);
                }
            }
        }
        fileComparator.compared(excel, csv);
    }

}
