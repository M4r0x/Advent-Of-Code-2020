package com.m4r0x.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, NoSuchElementException {
        part1v1();
        part1v2();
        part2v1();
        part2v2();
    }

    public static void part1v1() throws FileNotFoundException { // fast version of part 1 of task 1
        long startTime = System.nanoTime();
        File input = new File("input/task1input");
        Scanner scan = new Scanner(input);
        TreeSet<Integer> redBlackBinaryTree = new TreeSet<>();
        while (scan.hasNextLine()) {
            int i = Integer.parseInt(scan.nextLine());
            redBlackBinaryTree.add(i);
        }
        Iterator<Integer> ascendingIterator = redBlackBinaryTree.iterator();
        Iterator<Integer> descendingIterator = redBlackBinaryTree.descendingIterator();
        int a = ascendingIterator.next();
        int d = descendingIterator.next();
        while (a < d && a + d != 2020) {
            if (a + d < 2020) {
                a = ascendingIterator.next();
            } else {
                d = descendingIterator.next();
            }
        }
        System.out.println("part 1 version 1: " + a * d);
        System.out.println((System.nanoTime() - startTime) + " nanoseconds");
    }

    public static void part1v2() throws FileNotFoundException { // slow version of part 1 of task 1
        long startTime = System.nanoTime();
        File input = new File("input/task1input");
        Scanner scan = new Scanner(input);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scan.hasNextLine()) {
            int i = Integer.parseInt(scan.nextLine());
            arrayList.add(i);
        }
        for (Integer i : arrayList) {
            if (arrayList.contains(2020 - i)) {
                System.out.println("part 1 version 2: " + i * (2020 - i));
                break;
            }
        }
        System.out.println((System.nanoTime() - startTime) + " nanoseconds");
    }

    public static void part2v1() throws FileNotFoundException, NoSuchElementException { // fast version of part 2 of task 1
        long startTime = System.nanoTime();
        File input = new File("input/task1input");
        Scanner scan = new Scanner(input);
        TreeSet<Integer> redBlackBinaryTree = new TreeSet<>();
        while (scan.hasNextLine()) {
            int i = Integer.parseInt(scan.nextLine());
            redBlackBinaryTree.add(i);
        }
        Iterator<Integer> ascendingIterator = redBlackBinaryTree.iterator();
        Iterator<Integer> descendingIterator = redBlackBinaryTree.descendingIterator();
        int leftIteratorPos = ascendingIterator.next();
        int rightIteratorPos = descendingIterator.next();
        int midIteratorPos = redBlackBinaryTree.tailSet(ascendingIterator.next()).first();
        while (!redBlackBinaryTree.contains(2020 - leftIteratorPos - rightIteratorPos)
                && leftIteratorPos < rightIteratorPos) {
            if (leftIteratorPos + rightIteratorPos + midIteratorPos > 2020) {
                rightIteratorPos = descendingIterator.next();
            } else {
                leftIteratorPos = ascendingIterator.next();
                midIteratorPos = redBlackBinaryTree.tailSet(ascendingIterator.next()).first();
            }
        }
        System.out.println("part 2 version 1: " + (leftIteratorPos * rightIteratorPos *
                (2020 - leftIteratorPos - rightIteratorPos)));
        System.out.println((System.nanoTime() - startTime) + " nanoseconds");
    }

    public static void part2v2() throws FileNotFoundException { // slow version of part 2 of task 1
        long startTime = System.nanoTime();
        File input = new File("input/task1input");
        Scanner scan = new Scanner(input);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scan.hasNextLine()) {
            int i = Integer.parseInt(scan.nextLine());
            arrayList.add(i);
        }
        outerLoop:
        for (Integer i : arrayList) {
            for (Integer f : arrayList) {
                if (arrayList.contains(2020 - i - f)) {
                    System.out.println("part 2 version 2: " + i * f * (2020 - i - f));
                    break outerLoop;
                }
            }
        }
        System.out.println((System.nanoTime() - startTime) + " nanoseconds");
    }
}

