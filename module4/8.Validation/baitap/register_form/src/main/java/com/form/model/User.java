package com.form.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User implements Validator {
    @Size(min = 5 , max = 45 , message = "FirstName : 5 to 45")
    private String firstName;
    @Size(min = 5 , max = 45 , message = "LastName : 5 to 45")
    private String lastName;
    @NotBlank(message = "Not empty")
    @Email(message = "Format email!!!")
    private String email;
    @NotBlank(message = "Not empty")
    @Size(min = 10 , max = 11 , message = "length form 10 to 11.")
    private String phone;
    private int age;

    public User() {
    }

    public User(String firstName, String lastName, String email, String phone, int age ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String phone = user.getPhone();
        ValidationUtils.rejectIfEmpty(errors , "age" , "age.empty");
        int age = user.getAge();
        if(!phone.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phone" , "phone.matches");
        }
        if(!phone.startsWith("0")){
            errors.rejectValue("phone" , "phone.startsWith");
        }
        if(age < 18){
            errors.rejectValue("age" , "age.errors");
        }
    }
}
