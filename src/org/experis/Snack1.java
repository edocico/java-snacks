package org.experis;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci un numero pari compreso tra 10 e 20");

        int inputNum = scan.nextInt();

        do {
            System.out.println("inserisci un numero pari compreso tra 10 e 20");
            inputNum = scan.nextInt();


        } while (inputNum % 2 != 0 || (inputNum < 10 || inputNum > 20));

        System.out.println("ok");

        scan.close();
    }
}
