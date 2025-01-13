package lesson11.Task2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UserService {

    public static Set<String> getNames(List<User> users) {

        Set<String> names = new HashSet<>();

        for (User u : users) {
            names.add(u.name);
        }
        return names;
    }

    public static Set<User> byAge(List<User> users) {

        Set<User> sort = new TreeSet<>(users);

        return sort;
    }
}
