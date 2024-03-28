package org.experis;

import java.util.Arrays;
import java.util.Random;

public class Snack3 {
    public static void main(String[] args) {
        int[] num = new int[10];

        Random randomGen = new Random();

        int counter = 0;

        while (counter <= 9) {
            int x = randomGen.nextInt(100);
            num[counter] = x;
            counter++;
        }

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                sum += num[i];
            }
        }

        System.out.println(Arrays.toString(num));
        System.out.println(sum);

    }
}
