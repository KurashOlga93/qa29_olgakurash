package lesson4;

import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {

        int[] mass = {10, 150, 30, 90, 210, 5, 70, 80};
        int sum = 0;
        int min = mass[0];
        int max = mass[0];

        for (int i = 0; i < mass.length; i++) {

            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
            max = mass[i];

        }
            sum += mass[i];
        }

        System.out.println("Min element in array is: " + min);
        System.out.println("Max element in array is: " + max);
        System.out.println("Count of array elements is: " + (mass.length));
        System.out.println("Sum of array elements is: " + sum);
    }
}
