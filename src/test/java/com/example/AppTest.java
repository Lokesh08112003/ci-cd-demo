package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testGetMessage() {
        assertEquals(
            "CI/CD Pipeline is working successfully!",
            App.getMessage()
        );
    }
}