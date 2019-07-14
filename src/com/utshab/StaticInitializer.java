package com.utshab;

import java.util.*;

/*
Problem Link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */

public class StaticInitializer {
    private static boolean flag = false;
    private static int B;
    private static int H;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if ((B > 0) && (H > 0)) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
