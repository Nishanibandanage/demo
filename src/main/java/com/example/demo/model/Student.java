package com.example.demo.model;


import javax.validation.constraints.*;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name ="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "student_sequence")
    private Long id;
    @NotEmpty(message="Please provide name of the student")
    private String name;
    @NotNull(message="Please provide student city")
    private String city;

    @Min(value=18 , message="Must be equal or greater than 18")
    @Max(value=35, message="Must be equal or less than 35")
    private Integer age;
    @Email
    private String email;

    public Student() {
    }

    public Student(Long id, String name, String city, Integer age, String email){
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.email = email;

    }

    public Student(String name, String city, Integer age, String email){
        this.name = name;
        this.city = city;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
