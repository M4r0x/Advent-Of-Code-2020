package com.m4r0x.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        part1v1();
    }

    static void part1v1() throws FileNotFoundException {
        long startTime = System.nanoTime();
        int numberOfValidPasswords = 0;
        File input = new File("input/task2input");
        Scanner scan = new Scanner(input);
        while (scan.hasNextLine()) {
            int curFoundCharCount = 0;
            String checkSum = scan.next(); // enter first token of current input line which is the checkSum
            String[] checkSumValues = checkSum.split("-"); /* split the second token to see what the maximum and minimum
            allowed amount of the specified character in the password input is */
            int curCharCountMin = Integer.parseInt(checkSumValues[0]);
            int curCharCountMax = Integer.parseInt(checkSumValues[1]);
            char curSearchedChar = scan.next().toCharArray()[0]; // sets the current specified character we are searching for
            char[] curPasswordInput = scan.next().toCharArray();
            for (Character a : curPasswordInput) { // search through the third token for specified character and count up if found
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
}
