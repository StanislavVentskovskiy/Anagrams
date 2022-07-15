package com.ua.foxminded.foxstudent101882.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Anagram anagram = new Anagram();
        System.out.println(anagram.splitStringByWords(scan.nextLine()));


    }
  }