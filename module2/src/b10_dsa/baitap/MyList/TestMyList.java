package b10_dsa.baitap.MyList;

public class TestMyList {
    public static class Student {
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

    public static void main(String[] args) {
        Student a = new Student(1, "Vuong");
        Student b = new Student(2, "Khanh");
        Student c = new Student(3, "Trieu");
        Student d = new Student(4, "Trung");
        Student e = new Student(5, "Cuong");
        Student f = new Student(6, "Huynh");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(8,f);
        studentMyArrayList.size();
//        System.out.println(studentMyArrayList.size());

//        studentMyArrayList.clear();

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student stu = (Student) studentMyArrayList.elements[i];
            System.out.println("ID: " + stu.getId() + " & Name : " + stu.getName());
        }

//        System.out.println(studentMyArrayList.get(2).getName());
//        System.out.println(studentMyArrayList.indexOf(c));
//        System.out.println(studentMyArrayList.contains(b));

//        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
//        newMyArrayList = studentMyArrayList.clone();
//        newMyArrayList.remove(0);
//        Student student = newMyArrayList.remove(0);
//        System.out.println(student.getName()); // in ra ket qua cua phan tu remove
//        for (int i = 0; i < newMyArrayList.size(); i++) {
//            System.out.println(newMyArrayList.get(i).getName());
//        }
    }
}
