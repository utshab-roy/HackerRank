package com.utshab;

import java.util.Scanner;

/*
Problem Link: https://www.hackerrank.com/challenges/java-end-of-file/problem
 */

public class JavaEOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        String str;
        while (scanner.hasNext()){
            str = scanner.nextLine();
            System.out.println(count + " " + str);
            count++;
        }
    }
}
