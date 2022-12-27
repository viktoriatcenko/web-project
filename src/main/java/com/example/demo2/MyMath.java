package com.example.demo2;

public class MyMath {
    public static double divide(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Деление на 0");
        return number1 / number2;
    }
}
