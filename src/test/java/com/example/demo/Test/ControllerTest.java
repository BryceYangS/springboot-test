package com.example.demo.Test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ControllerTest {
    @Autowired
    Controller controller;

    @Test
    void test1() throws CloneNotSupportedException {
        controller.test();

    }
}