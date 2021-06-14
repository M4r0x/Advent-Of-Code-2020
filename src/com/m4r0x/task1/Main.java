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
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (scan.hasNextLine()) {
            int i = Integer.parseInt(scan.nextLine());
            arrayList.add(i);
        }
        for(int i=0;i<arrayList.size();i++) {
            for(int j=0;j<arrayList.size();j++) {
                if(arrayList.get(i) + arrayList.get(j) == 2020) {
                    System.out.println("The two numbers are: " + arrayList.get(i) + " and " + arrayList.get(j) + " which if you multiply them together results in the product: " + arrayList.get(i) * arrayList.get(j));
                    foundNumbers = true;
                    break;
                }
                if(foundNumbers) {
                    break;
                }
            }
        }
        System.out.println(System.nanoTime() - startTime+" nanoseconds");
    }
}
