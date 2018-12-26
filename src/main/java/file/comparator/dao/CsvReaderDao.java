package file.comparator.dao;

import file.comparator.entity.FileCsv;

import java.io.*;
import java.util.*;

public class CsvReaderDao {
   FileCsv fileCsv = new FileCsv();

    public Map<String,String> csvReader(InputStream inputStream) throws IOException {
        Map<String, String> csvMap = new TreeMap<String, String>();

        BufferedReader csvReader = null;
        String line = "";
        String splitCsvBy = fileCsv.getTypeSeparator();// ----- SET TYPE SPLITTER
        int one = fileCsv.getFirstIndexPosition();// ----- CHOOSE FIELD DATA POSITIONS
        int two = fileCsv.getSecondIndexPosition();// ----- CHOOSE FIELD DATA POSITIONS

        csvReader = new BufferedReader(new InputStreamReader(inputStream));
        csvReader.readLine();
        while ((line = csvReader.readLine()) != null ){
            String[] sum = line.split(",");
                csvMap.put(sum[1], sum[0]);// DATA POSITIONS
        }
        return csvMap;
    }
}
