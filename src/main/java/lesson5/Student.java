package lesson5;

public class Student {

    public String name;

    public String surname;

    public int age;

    public int lectionsCount;

    public String fullName(){

        return "User full name is: " + name + " " + surname;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Student(String name, String surname, int age, int lectionsCount) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lectionsCount = lectionsCount;
    }
}