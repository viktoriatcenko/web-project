package com.example.demo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void shouldThrowExceptionIdDivideByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            MyMath.divide(5, 0);
        });
    }
}