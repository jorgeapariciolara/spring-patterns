package com.example.springpatterns.patterns.structural.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealImageTest {

    RealImage realImage;

    @BeforeEach
    void setUp() {realImage = new RealImage("filename");}

    @Test
    @DisplayName("Prints image")
    void show() {assertDoesNotThrow(() ->realImage.show());}
}