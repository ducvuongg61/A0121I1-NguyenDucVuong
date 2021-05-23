package b10_dsa.baitap.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        MyLinkedList<Student> studentMyLinkedList = new MyLinkedList<>();
        Student a = new Student(1, "Vuong");
        Student b = new Student(2, "Hai");
        Student c = new Student(3, "Cong");
        Student d = new Student(4, "Tuan");
        Student e = new Student(5, "The");
        studentMyLinkedList.addFirst(a);
        studentMyLinkedList.addFirst(b);
        studentMyLinkedList.addLast(c);
        studentMyLinkedList.addLast(d);
        studentMyLinkedList.add(2,e);
        //remove 1 phan tu trong mang
        studentMyLinkedList.remove(1);

        //Lay so luong phan tu trong danh sach
//        for (int i = 0; i < studentMyLinkedList.size(); i++) {
//            Student student = (Student) studentMyLinkedList.get(i);
//            System.out.println(student.getName());
//        }

//        MyLinkedList<Student> cloneMyLinkedList = studentMyLinkedList.clone();
//        for (int i = 0; i < cloneMyLinkedList.size(); i++) {
//            Student student = (Student) cloneMyLinkedList.get(i);
//            System.out.println(student.getName());
//        }

        //Kiem tra xem element b co trong mang hay k
        System.out.println(studentMyLinkedList.constrain(b));
        //Tra ve vi tri phan tu trong mang
        System.out.println(studentMyLinkedList.indexOf(b));
    }
}
