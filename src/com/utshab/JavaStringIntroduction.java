package com.utshab;

import java.util.Scanner;

/*
Problem Link: https://www.hackerrank.com/challenges/java-strings-introduction/problem
 */

public class JavaStringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        /*
        this is a good link to read about it
        link: https://chortle.ccsu.edu/java5/Notes/chap92/ch92_2.html
         */
        int lexicographicOrder = A.compareTo(B);
        if (lexicographicOrder > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String str1 = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String str2 = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(str1 + " " + str2);

    }
}
