package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FactorialTest {

    private MathFunc math;

    @BeforeTest
    public void init() {
        math = new MathFunc();
    }

    @AfterTest
    public void tearDown() {
        math = null;
    }

    @Test
    public void calculateFactorial() {
      Assert.assertEquals(math.calculateFactorial(0), 1);
      Assert.assertEquals(math.calculateFactorial(1), 1);
      Assert.assertEquals(math.calculateFactorial(6), 720);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calculateFactorialNegative() {
        math.calculateFactorial(-1);
    }

}