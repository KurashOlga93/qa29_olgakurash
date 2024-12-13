package lesson5;

public class MainApp {
    public static void main(String[] args) {

        Student olga = new Student("Olga","Kurash");
        String olgaFullname = olga.fullName();
        System.out.println(olgaFullname);

        Student vova = new Student("Vova","Petrov", 25);
        String vovaFullname = vova.fullName();
        System.out.println(vovaFullname);
        
        Student ksenia = new Student("Ksenia","Levkova", 30, 4);
        String kseniaFullname = ksenia.fullName();
        System.out.println(kseniaFullname);

        ClassService cs = new ClassService();
        cs.lect(olga.surname, 5);
        cs.lect(vova.surname, 2);
        cs.lect(ksenia.surname, ksenia.lectionsCount);

    }




}
