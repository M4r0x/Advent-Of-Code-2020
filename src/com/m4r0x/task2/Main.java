package com.m4r0x.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        part1v1();
        part2v1();
    }

    static void part1v1() throws FileNotFoundException {
        long startTime = System.nanoTime();
        int numberOfValidPasswords = 0;
        File input = new File("input/task2input");
        Scanner scan = new Scanner(input);
        while (scan.hasNextLine()) {
            int curFoundCharCount = 0;
            String[] checkSumValues = scan.next().split("-");
            int curCharCountMin = Integer.parseInt(checkSumValues[0]);
            int curCharCountMax = Integer.parseInt(checkSumValues[1]);
            char curSearchedChar = scan.next().toCharArray()[0];
            char[] curPasswordInput = scan.next().toCharArray();
            for (Character a : curPasswordInput) {
                if (a == curSearchedChar) {
                    curFoundCharCount++;
                }
            }
            if (curFoundCharCount <= curCharCountMax && curFoundCharCount >= curCharCountMin) {
                numberOfValidPasswords++;
            }
        }
        System.out.println("part 1 version 1: " + numberOfValidPasswords);
        System.out.println((System.nanoTime() - startTime) + " nanoseconds");
    }
    static void part2v1() throws FileNotFoundException {
        long startTime = System.nanoTime();
        int numberOfValidPasswords = 0;
        File input = new File("input/task2input");
        Scanner scan = new Scanner(input);
        while (scan.hasNextLine()) {
            String[] charPositions = scan.next().split("-");
            int firstPos = Integer.parseInt(charPositions[0])-1;
            int secondPos = Integer.parseInt(charPositions[1])-1;
            char searchedChar = scan.next().toCharArray()[0];
            char[] passwordInput = scan.next().toCharArray();
            if( passwordInput[firstPos] == searchedChar ^ passwordInput[secondPos] == searchedChar) {
                numberOfValidPasswords++;
            }
        }
        System.out.println("part 2 version 1: " + numberOfValidPasswords);
        System.out.println((System.nanoTime() - startTime) + " nanoseconds");

    }
}
