package org.experis;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci dei numeri che rappresentano i secondi che saranno poi convertiti in hh:mm:ss");
        int input = scan.nextInt();
        int secCount = 0;
        int minCount = 0;
        int hourCount = 0;

        for (int i = 0; i < input; i++) {
                secCount++;
                if(secCount > 59) {
                    minCount++;
                    secCount = 0;
                    if (minCount > 59) {
                        hourCount++;
                        minCount = 0;
                    }
                }
        }

        String sec = String.valueOf(secCount);
        String min = String.valueOf(minCount);
        String hour = String.valueOf(hourCount);

        System.out.println("Conversione" + " " + hour + ":" + min + ":" + sec);
    }
}
