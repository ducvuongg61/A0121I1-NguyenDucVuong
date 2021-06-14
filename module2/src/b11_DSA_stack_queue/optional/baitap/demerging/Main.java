package b11_DSA_stack_queue.optional.baitap.demerging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("Smith","Male", "10/06/1994");
        Student sv2 = new Student("Jack","Female","06/04/1997");
        Student sv3 = new Student("MTP","Female","19/10/1994");
        Student sv4 = new Student("Johny Dang","Male","30/06/1994");
        Student sv5 = new Student("BayMax","Male","20/02/2000");


        List<Student> list = new ArrayList<>();

        list.add(sv1);
        list.add(sv2);
        list.add(sv3);
        list.add(sv4);
        list.add(sv5);

        Collections.sort(list);
        Manager manage = new Manager();

        manage.demerging(list);
        manage.display();
    }
}
