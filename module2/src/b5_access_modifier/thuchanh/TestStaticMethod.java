package b5_access_modifier.thuchanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // call change method

        //creating objects
        Student s1 = new Student(111 , "Khoa");
        Student s2 = new Student(222, "Linh");
        Student s3 = new Student(333 , "Hanh");

        //calling display method
        s1.display();;
        s2.display();
        s3.display();
    }
}
