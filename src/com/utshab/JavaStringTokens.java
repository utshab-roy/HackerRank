package com.utshab;

import java.io.*;
import java.util.*;
/*
Problem Link: https://www.hackerrank.com/challenges/java-string-tokens/problem
 */

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Write your code here.
        s = s.trim();
        //special case when there is no word
        if (s.length() == 0){
            System.out.println(0);
            return;
        }

        String[] result = s.split("[^a-zA-Z]+");
        System.out.println(result.length);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        scan.close();
    }
}
