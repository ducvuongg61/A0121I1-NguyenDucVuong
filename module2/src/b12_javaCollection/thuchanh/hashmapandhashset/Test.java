package b12_javaCollection.thuchanh.hashmapandhashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Smith", 18, "England");
        Student student2 = new Student("John", 18, "ThaiLand");
        Student student3 = new Student("Tom", 18, "Japan");
        Student student4 = new Student("Hunter", 18, "China");

        //HashMap
        Map<Integer, Student> hashMap = new HashMap<Integer, Student>();
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);
        hashMap.put(4, student4);

        for (Map.Entry<Integer, Student> studentEntry : hashMap.entrySet()) {
            System.out.println(studentEntry.toString());
        }

        System.out.println("----------------------------------------");

        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);

        for (Student student : studentSet) {
            System.out.println(studentSet);
        }
    }
}
