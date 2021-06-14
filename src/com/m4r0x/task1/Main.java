package com.m4r0x.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.nanoTime();
        boolean foundNumbers = false;
        File input = new File("input/task1input");
        Scanner scan = new Scanner(input);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scan.hasNextLine()) {
            int i = Integer.parseInt(scan.nextLine());
            arrayList.add(i);
        }
        for(Integer a : arrayList) {
            if(arrayList.contains(2020-a)) {
                System.out.println("The two numbers that add up to 2020 in the given Input are: " + a + " and " + (2020 - a) + "\nThe product of said 2 integers is: " + a * (2020 - a));
                break;
            }
        }
        System.out.println(System.nanoTime() - startTime+" nanoseconds");
    }
}
