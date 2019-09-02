package com.utshab;

public class WhiteSpaceRemove
{
    public static void main(String[] args)
    {
        String str = "how to do i2323n     123123   java provides java tutorials";

        String newStr = str.replaceAll("\\d+", "");
        newStr = newStr.replaceAll("\\s+", " ");

        System.out.println(newStr);
    }
}