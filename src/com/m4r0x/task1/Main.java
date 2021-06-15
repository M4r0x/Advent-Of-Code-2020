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
        getNumberPairInTreeSetThatAddsToGivenSum(redBlackBinaryTree, 2020);
        System.out.println(new StringBuilder(Long.toString(System.nanoTime() - startTime)).append(" nanoseconds"));
    }
    public static void getNumberPairInTreeSetThatAddsToGivenSum(TreeSet<Integer> input, int sum) throws NullPointerException {
        int leftPointer = input.first(); // leftPointer starts on the lowest value of the TreeSet
        int rightPointer = input.last(); // rightPointer starts on the highest value of the TreeSet
        while (leftPointer + rightPointer != sum) {
            if (leftPointer + rightPointer < sum) {
                leftPointer = input.higher(leftPointer); //leftPointer moves to next higher value of the TreeSet
            } else if (leftPointer + rightPointer > sum) {
                rightPointer = input.lower(rightPointer); //rightPointer moves to next lower value of the TreeSet
            } else {
                System.out.println("There is no given pair of numbers in the TreeSet that adds up to the given sum.");
                break;
            }
        }
        System.out.println(new StringBuilder("The numbers that add up to 2020 in the given Input are ").
                append(leftPointer).append(" and ").append(rightPointer).append(" which if multiplied add up to: ").
                append(leftPointer * rightPointer));
    }
}
