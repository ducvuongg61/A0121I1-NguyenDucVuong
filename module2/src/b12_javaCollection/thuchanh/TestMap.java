package b12_javaCollection.thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> stringMap = new HashMap<>();
        stringMap.put("Smith", 2);
        stringMap.put("Coca", 3);
        stringMap.put("Baby", 4);
        stringMap.put("Susi", 5);
        stringMap.put("MaCao", 6);
        stringMap.put("Hung", 3);
        stringMap.put("Hunter", null);
        System.out.println("Display : ");
        System.out.println(stringMap);

        System.out.println();
        System.out.println();

        Map<String , Integer> treeMap = new TreeMap<>(stringMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        System.out.println();
        System.out.println();

        Map<String , Integer> linkMap = new LinkedHashMap<>(16, 0.75f , true);
        linkMap.put("Smith", 4);
        linkMap.put("Jack" , 5);
        linkMap.put("Hunt" , 9);
        System.out.println("\nThe age for " + "Smith is " + linkMap.get("Smith"));
    }
}
