package com.example.springpatterns.patterns.structural.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProxyImageTest {

    ProxyImage proxyImage;

    @BeforeEach
    void setUp() {proxyImage = new ProxyImage("filename");}

    @Test
    @DisplayName("sets up the real image if null and shows it")
    void showCreate() {
        assertDoesNotThrow(() ->proxyImage.show());
        proxyImage.show();
    }

}