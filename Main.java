package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String name = read.nextLine();

        String[] words  =  name.split(" ");
        String revString = "";

        for (String word: words) {
            String revWord  = "";

            for (int j = 0; j < word.length(); j++) {
                if (!Character.isAlphabetic(word.charAt(j))) {
                    continue;
                } else {
                    revWord = word.charAt(j) + revWord;
                }
            }
            for (int j = 0; j < word.length(); j++) {
                if (!Character.isAlphabetic(word.charAt(j))) {
                    String firstPart = revWord.substring(0, j);
                    String lastPart = revWord.substring(j);
                    revWord = firstPart + word.charAt(j) + lastPart;
                }
            }
            revString = revString + revWord + " ";
        }

//        for(int i = 0; i < words.length; i++) {
//            String word = words[i];
//            String revWord  = "";
//
//            for(int j =  word.length() -1; j >= 0; j--) {
//                revWord = revWord + word.charAt(j);
//            }
//
//            revString = revString + revWord + " ";
//        }

        System.out.println(revString);


    }
}

