package b11_DSA_stack_queue.baitap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DemSoLanXuatHienSuDungMap {
    public static void main(String[] args) {
        Map<String,Integer> treeMap = new LinkedHashMap<>();
        Set<String> set = treeMap.keySet();
        String mainString = "Di hoc suot ngay suot doi haizzz";
        for (String word : mainString.split(" ")) {
            if (set.contains(word)) treeMap.put(word, (int) (treeMap.get(word)) + 1);
            else treeMap.put(word, 1);
        }

        for (String key : set) {
            System.out.println(key + " " + treeMap.get(key));
        }
    }
}
