package com.example.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void additionWorks() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void stringContains() {
        assertTrue("JUnit5".contains("JUnit"));
    }

    @Test
    void listSize() {
        java.util.List<String> list = java.util.Arrays.asList("a", "b", "c");
        assertEquals(3, list.size());
    }
}
