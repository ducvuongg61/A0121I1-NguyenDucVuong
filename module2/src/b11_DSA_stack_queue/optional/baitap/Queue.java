package b11_DSA_stack_queue.optional.baitap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi : ");
        String s = sn.nextLine();
        String[] arr = s.split("\\s+");

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String x : arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

