package com.m4r0x.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        part1v1();
        part2v1();
    }

    static void part1v1() throws FileNotFoundException {
        File input = new File("input/task3input");
        Scanner scanner = new Scanner(input);
        ArrayList<ArrayList<Character>> matrix = new ArrayList<>();
        while (scanner.hasNextLine()) {
            char[] inputLine = scanner.next().toCharArray();
            matrix.add(new ArrayList<>());
            for (char ch : inputLine) {
                matrix.get(matrix.size() - 1).add(ch);
            }
        }
        int yCoordinate = 0;
        int xCoordinate = 0;
        int treesEncountered = 0;
        while (true)
            try {
                yCoordinate++;
                xCoordinate += 3;
                xCoordinate %= matrix.get(0).size();
                if (matrix.get(yCoordinate).get(xCoordinate) == '#') {
                    treesEncountered++;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("part 1 version 1: "+treesEncountered);
                break;
            }
    }

    static void part2v1() throws FileNotFoundException {
        File input = new File("input/task3input");
        Scanner scanner = new Scanner(input);
        ArrayList<ArrayList<Character>> matrix = new ArrayList<>();
        while (scanner.hasNextLine()) {
            char[] inputLine = scanner.next().toCharArray();
            matrix.add(new ArrayList<>());
            for (char ch : inputLine) {
                matrix.get(matrix.size() - 1).add(ch);
            }
        }
        int yCoordinate = 0;
        int xCoordinate = 0;
        int treesEncountered = 0;
        int counter = 1;
        ArrayList<Integer> results = new ArrayList<>();
        while (true)
            try {
                yCoordinate += 2;
                xCoordinate++;
                xCoordinate %= matrix.get(0).size();
                if (matrix.get(yCoordinate).get(xCoordinate) == '#') {
                    treesEncountered++;
                }
            } catch (IndexOutOfBoundsException e) {
                results.add(treesEncountered);
                break;
            }
        while (counter <= 7) {
            treesEncountered = 0;
            xCoordinate = 0;
            yCoordinate = 0;
            while (true)
                try {
                    yCoordinate++;
                    xCoordinate += counter;
                    xCoordinate %= matrix.get(0).size();
                    if (matrix.get(yCoordinate).get(xCoordinate) == '#') {
                        treesEncountered++;
                    }
                } catch (IndexOutOfBoundsException e) {
                    results.add(treesEncountered);
                    counter += 2;
                    break;
                }
        }
        long product = 1;
        for (Integer i : results) {
            product *= i;
        }
        System.out.println("part 2 version 1: "+product);
    }
}
