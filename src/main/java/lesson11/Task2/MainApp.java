package lesson11.Task2;

import java.util.*;

import static lesson11.Task2.UserService.byAge;
import static lesson11.Task2.UserService.getNames;

public class MainApp {

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        list.add(new User("Olga", 31));
        list.add(new User("Vlad", 19));
        list.add(new User("Olga", 17));
        list.add(new User("Tatiana", 26));
        list.add(new User("Anatoliy", 42));
        list.add(new User("Kirill", 29));
        list.add(new User("Vlad", 5));

        Set<String> uNames = getNames(list);

        System.out.println(uNames);

        Set<User> sortedUsers = byAge(list);

        System.out.println(sortedUsers);

    }

}
