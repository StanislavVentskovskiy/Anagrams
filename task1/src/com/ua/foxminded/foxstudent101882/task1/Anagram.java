package com.ua.foxminded.foxstudent101882.task1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anagram {

    public static String reverseString(String text) {


        StringBuffer result = new StringBuffer();
        Matcher m = Pattern.compile("\\p{L}+").matcher(text);
            while (m.find()) {
                String replacement = new StringBuilder(m.group()).reverse().toString();
                m.appendReplacement(result, replacement);
            }

        m.appendTail(result);
        return result.toString();

        }

    public static String splitStringByWords(String text) {

            String[] wordsArray = text.split(" ");

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < wordsArray.length; i++) {

                result.append(reverseString(wordsArray[i]));
                result.append(" ");
            }

            return result.toString();


        }

    }

