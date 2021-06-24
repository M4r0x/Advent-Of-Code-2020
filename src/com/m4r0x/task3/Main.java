package com.m4r0x.task3;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        part1v1();
    }
    static void part1v1() throws FileNotFoundException
    {
        File input = new File("input/task3input");
        Scanner scanner = new Scanner(input);
        ArrayList<Character> arrayList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            char[] currentLine = scanner.next().toCharArray();
            for(Character ch : currentLine) {
                arrayList.add(ch);
            }
        }
        System.out.println(arrayList.get(340));
    }
}
