package com.ua.foxminded.task1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anagram {

        public String splitStringByWords(String text) {

        String[] wordsArray = text.split("((?= )|(?<= ))");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < wordsArray.length; i++) {

            result.append(reverseString(wordsArray[i]));
        }

        return result.toString();
    }

      private String reverseString(String text) {

        StringBuffer result = new StringBuffer();
        Matcher m = Pattern.compile("\\p{L}+").matcher(text);
            while (m.find()) {

                String replacement = new StringBuilder(m.group()).reverse().toString();
                m.appendReplacement(result, replacement);
            }

        m.appendTail(result);
        return result.toString();
        }

    }

