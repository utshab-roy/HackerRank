package com.utshab;

import java.util.*;
import java.text.*;

/*
Problem Link: https://www.hackerrank.com/challenges/java-currency-formatter/problem
 */

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale INDIA = new Locale("en", "IN");

        String us  = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india  = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china  = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france  = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
