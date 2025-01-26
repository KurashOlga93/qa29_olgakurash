package lesson11.Task1;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 1, 1, 2, 3, 3, 4, 5, 5, 5, 5, 6, 7, 7);

        Map<Integer, Integer> numbersMap = new HashMap<>();

        for (Integer number : numbers) {
            if (numbersMap.containsKey(number)) {
                int count = numbersMap.get(number);
                numbersMap.put(number, count + 1);
            }
            else {
                numbersMap.put(number, 1);
            }
        }

        System.out.println(numbersMap);

    }
}
