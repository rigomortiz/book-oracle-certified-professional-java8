package com.rigobertocanseco.numbers;

/**
 * Inheritance
 */
public class TestNumber {
    public static int sum(Number []numbers){
        int sum = 0;
        for (Number number: numbers){
            sum += number.intValue();
        }
        return sum;
    }

    public static void main(String[] s){
        Number []numbers = new Number[]{
                (byte) 10,  10,  10f, 10.0f
        };
        System.out.println("The sum of numbers is: " + sum(numbers));
    }
}
