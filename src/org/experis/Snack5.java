package org.experis;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci una stringa casuale che può essere composta sia di lettere che di numeri che di" +
                " simboli");
        String input = scan.nextLine();
        char[] charArray = input.toCharArray();

        int digitCount = 0;
        int letterCount = 0;
        int symbolCount = 0;

        for (int i = 0; i < charArray.length; i++) {



           boolean checkDigit = Character.isDigit(charArray[i]);

           boolean checkLetter = Character.isLetter(charArray[i]);

           if (checkDigit) {
               digitCount++;
           } else if (checkLetter) {
               letterCount++;
           } else if (!Character.isDigit(charArray[i]) && !Character.isLetter(charArray[i]) && !Character.isWhitespace(charArray[i])) {
               symbolCount++;
           }
        }

        System.out.println("ha" + " " + digitCount + " " + "numeri");
        System.out.println("ha" + " " + letterCount + " " + "lettere");
        System.out.println("ha" + " " + symbolCount + " " + "simboli");
    }
}
