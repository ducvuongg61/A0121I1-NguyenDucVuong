package b11_DSA_stack_queue.optional.baitap.demerging;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
    private String name;
    private Date birthday;
    private String sex;

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Student(String name, String sex, String birthday) {
        this.name = name;
        this.sex = sex;
        setBirthday(birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.birthday = dateFormat.parse(birthday);
        } catch (ParseException e){
            System.out.println(e.getMessage());
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void show(){
        System.out.println("Student with @ name : " + name + " , birthday : " + birthday + " , sex : " + sex);
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
