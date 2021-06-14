package com.m4r0x.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int b = 0;
        File input = new File("input/task1input");
        Scanner scan = new Scanner(input);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (scan.hasNextLine()) {
            int i = Integer.parseInt(scan.nextLine());
            arrayList.add(i);
        }
        for(int i=0;i<arrayList.size();i++) {
            for(int j=0;j<arrayList.size();j++) {
                if(arrayList.get(i) + arrayList.get(j) == 2020 && b == 0) {
                    System.out.print("The two numbers are: "+ arrayList.get(i) +" and "+ arrayList.get(j)+" which if you multiply them together results in the product: "+arrayList.get(i)*arrayList.get(j));
                    b++;
                }
            }
        }
    }
}
