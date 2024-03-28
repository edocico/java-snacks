package org.experis;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci una parola e verifichiamo se è palindroma");
        String input = scan.nextLine();
        String lowerInput = input.toLowerCase();
        char[] charInput = lowerInput.toCharArray();

        int startPosition = 0;
        int endPosition = charInput.length - 1;
        boolean isPalindrome = true;

        for (int i = 0; i < charInput.length; i++) {
            if (charInput[startPosition] == charInput[endPosition]) {
                startPosition++;
                endPosition--;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("la parola è palindroma");
        } else {
            System.out.println("la parola non è palindroma");
        }
    }
}
