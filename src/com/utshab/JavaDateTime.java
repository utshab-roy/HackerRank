package com.utshab;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
Problem Link: https://www.hackerrank.com/challenges/java-date-and-time/problem
 */

class Result {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        DateFormat dateFormat;
        dateFormat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely

        Calendar calendar = Calendar.getInstance();
        /*
          The key thing to note is that in Calender class the month value
          starts from 0 - 11
          So that January starts from 0 and December is 11
         */
        calendar.set(year, (month - 1), day);
        Date date = calendar.getTime();
        String dayName = dateFormat.format(date);
//        System.out.println(dayName.toUpperCase());
        return dayName.toUpperCase();
    }
}

public class JavaDateTime {
    public static void main(String[] args) throws IOException {
//        Result.findDay(8, 5, 2015);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
