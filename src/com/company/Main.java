package com.company;
/*
The program will loop through that string and replace
 "my" with "your" and "me" with "you" and then prepend
 the qualifier to the replacement string.
 So, my teacher hates me becomes "Why do you say that your teacher hates you?"
 The replacement method returns the same words as the user
 entered only the replacement words have been swapped.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = " ";

        System.out.println("Good day. What is your problem? " +
                "Enter your response here or Q to quit:");
        answer = input.nextLine();

        while (!answer.equalsIgnoreCase("Q")) {
            talkTherapy(answer);
            System.out.println("\n\nEnter your response here or Q to quit:");
            answer = input.nextLine();
        }

    }

    public static void talkTherapy(String m) {
        String[] wordSplit = m.split(" ");


        for (int i = 0; i < wordSplit.length; i++) {
            if (wordSplit[i].equalsIgnoreCase("i")) {
                wordSplit[i] = "you";
            } else if (wordSplit[i].equalsIgnoreCase("me")) {
                wordSplit[i] = "you";
            } else if (wordSplit[i].equalsIgnoreCase("my")) {
                wordSplit[i] = "your";
            } else if (wordSplit[i].equalsIgnoreCase("am")) {
                wordSplit[i] = "are";

            }
        }

        for (int i = 0; i < wordSplit.length; i++) {
            System.out.print(wordSplit[i] + " ");
        }

    }
}




