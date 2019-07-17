package com.utshab;

import java.util.Scanner;

/*
Problem Link: https://www.hackerrank.com/challenges/java-string-compare/problem
 */

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;
        String[] strArray = new String[s.length() - k + 1];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //formula: length - k + 1
        //to get all the combination that can be generated by substring with length of k
        int lastPosition = k;
        for (int i = 0; i < (s.length() - k + 1); i++) {
            strArray[i] = (s.substring(i, lastPosition));
            lastPosition++;
        }

        smallest = strArray[0];
        largest = strArray[0];
        int minInt = smallest.compareTo(strArray[0]);
        int maxInt = largest.compareTo(strArray[0]);

        for (int i = 0; i < strArray.length; i++) {

            if (smallest.compareTo(strArray[i]) > minInt){
               smallest = strArray[i];
            }
            if (largest.compareTo(strArray[i]) < maxInt){
                largest = strArray[i];
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
