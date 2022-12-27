package com.example.demo2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {
    private static Vector2D v;

    @BeforeAll
    public static void createNewVector() {
        // action
        v = new Vector2D();
    }

    @Test
    @DisplayName("Проверка создания простого объекта Вектора, значение должно быть нулевое")
    void newVectorShouldHaveZeroLength() {
        // assertion
        Assertions.assertEquals(0, v.length());
    }

    @Test
    void newVectorShouldHaveZeroPointX() {
        Assertions.assertEquals(0, v.getX());
    }

    @Test
    void newVectorShouldHaveZeroPointY() {
        Assertions.assertEquals(0, v.getY());
    }

    @AfterAll
    public static void setVectorNull() {
        v = null;
    }
}