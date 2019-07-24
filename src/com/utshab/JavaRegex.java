package com.utshab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/*
Problem Link: https://www.hackerrank.com/challenges/java-regex/problem
 */
public class JavaRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

/*
    copied from online
    Helpful Link:
    https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
    [01]?\\d{1,2}   matches numbers 0-199.
    2[0-4]\\d       matches numbers 200-249
    25[0-5]         matches numbers 250-255
*/
class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." + num + "." + num + "." + num;
}
