package file.comparator.service;

import java.util.*;

public class FileComparator {
   static WriteComparedFile writeComparedFile = new WriteComparedFile();

   private static TreeMap<String, Object> merged = new TreeMap<>();

    public static void compared(Map<String, String> excel, Map<String, String> csv) {
        for (String key : csv.keySet()) {
            if (excel.containsKey(key) && !excel.get(key).equals(csv.get(key))) {
                Map<String,String> values = new TreeMap<String, String>();
                values.put(excel.get(key), csv.get(key));
                for (Map.Entry<String, String> set : values.entrySet()) {
                    if(!merged.containsKey(key)){
                        merged.put(key, set);
                    }
                }
            }
        }
        writeComparedFile.createExcel(merged);
    }

    public TreeMap<String, Object> getMerged() {
        return merged;
    }

}
