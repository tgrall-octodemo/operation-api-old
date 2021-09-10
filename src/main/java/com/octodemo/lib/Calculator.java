package com.octodemo.lib;

/**
 * Hello world!
 * 
 */
public class Calculator
{

    public String greetings = "Welcome to the Calculator API";


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

        System.out.println(a);

        return false;
    }

}
