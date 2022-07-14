package com.ua.foxminded.foxstudent101882.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {

    public static String makesAnagram(String text) {

        char[] textCharArray = text.toCharArray();
        StringBuilder reverseText = new StringBuilder();

        reverseText.reverse();

        char[] reverseTextCharArray = reverseText.toString().toCharArray();
        char temp;
        for (int i = 0; i < textCharArray.length; ) {
            for (int j = textCharArray.length - 1; j > i; ) {

                if (Character.isAlphabetic(textCharArray[i])) {
                    if (Character.isAlphabetic(textCharArray[j])) {

                        temp = textCharArray[i];
                        textCharArray[i] = textCharArray[j];
                        textCharArray[j] = temp;
                        i++;
                        j--;

                    } else {
                        j--;
                    }
                } else {
                    i++;
                }
            }
            break;
        }
        return String.valueOf(textCharArray);
    }

    public static String splittingStringAnagram() {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] wordsArray = read.readLine().split(" ");

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < wordsArray.length; i++) {

                result.append(makesAnagram(wordsArray[i]));
                result.append(" ");
            }

            return result.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
