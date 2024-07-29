package com.example.demo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Linxingwu
 */
public class IndexTest {
    private Index indexController = new Index();

    @Test
    void testIndex() {
        System.out.println("testcase");
        Assertions.assertEquals("hello world", indexController.index());
    }
}
