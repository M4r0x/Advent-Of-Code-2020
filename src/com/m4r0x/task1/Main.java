package com.m4r0x.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input/task1input");
        Scanner scan = new Scanner(input);
        TreeSet<Integer> redBlackBinaryTree = new TreeSet<Integer>();
        while (scan.hasNextLine()) {
            int i = Integer.parseInt(scan.nextLine());
            redBlackBinaryTree.add(i);
        }
        Iterator<Integer> ascendingIterator = redBlackBinaryTree.iterator();
        Iterator<Integer> descendingIterator = redBlackBinaryTree.descendingIterator();

        int a = ascendingIterator.next();
        int d = descendingIterator.next();
        while (a < d && a + d != 2020) {
            if(a+d < 2020) {
                a = ascendingIterator.next();
            } else {
                d = descendingIterator.next();
            }
        }
        System.out.println(a*d);
    }
}
