package com.utshab;

import java.util.Scanner;

/*
Problem Link: https://www.hackerrank.com/challenges/java-string-reverse/problem
 */

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        /* Enter your code here. Print output to STDOUT. */
        StringBuilder str = new StringBuilder();
        //looping in reverse order
        for (int i = A.length()-1; i >= 0; i--) {
            char x = A.charAt(i);
            str.append(x);
        }
        if (A.compareTo(str.toString()) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
