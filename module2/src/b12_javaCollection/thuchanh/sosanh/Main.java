package b12_javaCollection.thuchanh.sosanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vuong", 21, "Quang Tri");
        Student student2 = new Student("Toan ", 20, "Quang Nam");
        Student student3 = new Student("Nha", 20, "Da Nang");
        Student student4 = new Student("Vinh", 19, "Hue");

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        Collections.sort(students);
        for (Student st : students) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        //Collections.sort(students, ageComparator); co the su dung cai nay
        students.sort(ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student st : students) {
            System.out.println(st.toString());
        }
    }
}
