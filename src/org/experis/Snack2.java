package org.experis;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] name = {"marco", "matteo", "alessandro", "francesco", "lorenzo", "giuseppe", "edoardo", "leonardo",
                "riccardo", "fabrizio"};

        String[] surname = {"rossi", "bianchi", "maestri", "neri", "rizzo", "carrara", "antonioli", "antognoni",
                "mazza", "mattei"};

        String[] completeName = new String[10];

        int counter = 0;

        Random randomNum = new Random();



        do {
            int x = randomNum.nextInt(name.length);
            int y = randomNum.nextInt(surname.length);
            completeName[counter] = name[x] + " " + surname[y];
            counter++;
        } while (counter <= 9);

        System.out.println(Arrays.toString(completeName));
    }
}
