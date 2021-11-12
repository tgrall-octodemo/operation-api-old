package com.octodemo.lib;

/**
 * Hello world!
 * 
 */
public class Calculator
{

    public String greetings = "Welcome to the Calculator API";
    private final static String STK = "vStLjoQnxbkYNg.atlasv1.SJuX2rdMQChw3AvQ5QAsyJ8NencfZWsCGEee1LVzNxCcy9a0s5GMme3kFAGenWMLqMA";


    public int add(int a, int b) {
        System.out.println( greetings.toUpperCase() );
        return a + b;
    }


    public int sub(int a, int b) {
        return a - b;
    }

    public String toUpper(String s) {
        if (s.equals("")) {
            return null;
        }
        return s.toUpperCase();
    }

    private boolean isThataGoodMethod(int a, int b) {
        return false;
    }

}
