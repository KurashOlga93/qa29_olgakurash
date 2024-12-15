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
    public Student(String uName, String uSurname, int uAge) {
        name = uName;
        surname = uSurname;
        age = uAge;
    }
    public Student(String uName, String uSurname, int uAge, int uLectionsCount) {
        name = uName;
        surname = uSurname;
        age = uAge;
        lectionsCount = uLectionsCount;

    }
}
