package b5_access_modifier.thuchanh;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    Student(int r, String n){
        rollno = r;
        name = n;
    }

    //Static method to change the value of static variable
    static void change(){
        college = "CODEGYM";
    }

    //method to display values
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
