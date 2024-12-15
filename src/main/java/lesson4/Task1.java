package lesson4;

import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {

        int[] mass1 = {10, 150, 30, 6, 210, 5, 70, 80, 37};
        int[] mass2 = {1, 150, 5, 6, 37, 8, 70};

        for (int i = 0; i < mass1.length; i++) {
            for (int a = 0; a < mass2.length; a++) {
                if (mass1[i] == mass2[a]) {
                    System.out.println("Repeating elements in both arrays " + mass1[i]);
                    break;
                }
            }
        }
    }
}








