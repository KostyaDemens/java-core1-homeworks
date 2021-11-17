package ru.geekbrains.java_core1.homeworks.homework4_OOP;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int phoneNum;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, int phoneNum, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String toString() {
        return(name + "\n" + position + "\n" + email + "\n" + phoneNum + "\n" + salary + "\n" + age);
    }
}
