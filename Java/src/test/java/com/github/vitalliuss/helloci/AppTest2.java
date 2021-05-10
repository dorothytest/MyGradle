package com.github.vitalliuss.helloci;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest2 {
    @Test
    public void testShouldBePassed() {
        assertTrue(true);
    }

    @Test
    public void testAnotherClass() {
        TestClass.testMethod();
    }
}
