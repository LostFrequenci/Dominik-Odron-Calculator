package com.kodilla;

public class Calculator {

    public int addition (int a, int b) {
        return a+b;
    }

    public int subtraction (int a, int b) {
        return a-b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        System.out.println("Suma dwóch cyfr wynosi: "+calculator.addition(5,3));
        System.out.println("Odejmowanie dwóch cyfr wynosi: "+calculator.subtraction(5,3));
    }
}
