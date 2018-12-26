package file.comparator.entity;

import java.util.TreeMap;

public class ComparedObject {

    private TreeMap<String, Object> map;

   public ComparedObject() {

    }

    public ComparedObject(TreeMap<String, Object> map) {
        this.map = map;
    }

    public TreeMap<String, Object> getMap() {
        return map;
    }

    public void setMap(TreeMap<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ComparedObject{" +
                "map=" + map +
                '}';
    }
}

