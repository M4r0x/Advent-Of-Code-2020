package com.m4r0x.task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        part1v1();
    }
    static void part1v1() throws FileNotFoundException {
        File input = new File("input/task4input");
        Scanner scanner = new Scanner(input);
        ArrayList<String> passportList = new ArrayList<>();
        String passport = "";
        int validPassports = 0;
        while(scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();

            if (nextLine != "") {
                passport+=nextLine;
            } else {
                passportList.add(passport);
                passport = "";
            }
        }
        passport = "";
        for(String string : passportList) {
            if(string.contains("byr:") && string.contains("iyr:") && string.contains("eyr:") && string.contains("hgt")
                    && string.contains("hcl:") && string.contains("ecl:") && string.contains("pid:")) {
                // apparently thanks to something called "short circuiting" this is just as fast as doing nested "if" statements
                // where after each "if" there is a possible "escape" so it stops checking the other conditions
                validPassports++;
            }
        }
        System.out.println("part 1 version 1: "+validPassports);
    }
}
