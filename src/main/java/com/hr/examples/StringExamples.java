package com.hr.examples;

public class StringExamples {

    public static void main(String[] args) {

        System.out.println("Substring: ");
        String s = "This is a string";
        System.out.println(s.substring(5));
        System.out.println((s.substring(5,6))); // can be replaced with charAt(i)
        System.out.println(s.substring(5,7));

    }
}
