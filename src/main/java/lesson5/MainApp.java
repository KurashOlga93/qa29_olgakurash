package lesson5;

public class MainApp {
    public static void main(String[] args) {

        Student olga = new Student("Olga", "Kurash");
        String olgaFullname = olga.fullName();
        System.out.println(olgaFullname);
        System.out.println("Surname " + olga.surname + " has " + olga.lectionsCount + " classes");

        Student vova = new Student("Vova", "Petrov", 25);
        String vovaFullname = vova.fullName();
        System.out.println(vovaFullname);
        System.out.println("Surname " + vova.surname + " has " + vova.lectionsCount + " classes");

        Student ksenia = new Student("Ksenia", "Levkova", 30, 4);
        String kseniaFullname = ksenia.fullName();
        System.out.println(kseniaFullname);
        System.out.println("Surname " + ksenia.surname + " has " + ksenia.lectionsCount + " classes");
    }
}