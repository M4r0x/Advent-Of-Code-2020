package com.m4r0x.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.nanoTime();
        File input = new File("input/task1input");
        Scanner scan = new Scanner(input);
        TreeSet<Integer> redBlackBinaryTree = new TreeSet<>();
        while (scan.hasNextLine()) {
            int i = Integer.parseInt(scan.nextLine());
            redBlackBinaryTree.add(i);
        }
        for (Integer a : redBlackBinaryTree) {
            if (redBlackBinaryTree.contains(2020 - a)) {
                System.out.println(new StringBuilder("The two numbers that add up to 2020 in the given Input are: ").
                        append(a).append(" and ").append((2020 - a)).append("\nThe product of said 2 integers is: ").
                        append(a * (2020 - a)));
                break;
            }
        }
        System.out.println(new StringBuilder(Long.toString(System.nanoTime() - startTime)).append(" nanoseconds"));
    }
}
