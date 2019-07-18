package com.utshab;

import java.util.Scanner;

/*
Problem Link: https://www.hackerrank.com/challenges/java-anagrams/problem
 */

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        boolean flag = true;
        //the two string length is different
        if (a.length() != b.length()){
            return false;
        }else {
            //the two string length are equal
            char[] aChar =  a.toLowerCase().toCharArray();
            aChar = mySort(aChar);
            char[] bChar =  b.toLowerCase().toCharArray();
            bChar = mySort(bChar);

            for (int i = 0; i < aChar.length; i++) {
                if (aChar[i] != bChar[i]){
                    return false;
                }
            }
            return true;
        }
    }

    static char[] mySort(char[] a){
        boolean sorted = false;
        char temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
