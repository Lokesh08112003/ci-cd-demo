package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testGetMessage() {
        assertEquals("CI/CD Pipeline is working!", App.getMessage());
    }
}