package com.utshab;

import java.util.*;
import java.io.*;

/*
Problem Link: https://www.hackerrank.com/challenges/java-loops
 */
public class JavaLoopsTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int x = a;
            int gunok = 1;
            for (int j = 0; j < n; j++) {
                x = x + (gunok * b);
                gunok = gunok * 2;
                System.out.print(x + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
