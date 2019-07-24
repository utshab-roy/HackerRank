package com.utshab;

import java.util.Scanner;
import java.util.regex.*;

/*
Problem Link: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 */

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        boolean flag = false;
        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern pt = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
