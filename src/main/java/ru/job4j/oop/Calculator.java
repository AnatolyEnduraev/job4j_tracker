package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int difference(int y) {
        return y - x;
    }

    public int divide(int y) {
        return x / y;
    }

    public int sumAllOperation(int y, int a) {
        return sum(y) + multiply(a) + difference(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(5));
        System.out.println(calculator.multiply(5));
        System.out.println(difference(5));
        System.out.println(calculator.divide(5));
        System.out.println(calculator.sumAllOperation(5, 5));
    }
}
