package com.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialZero() {
        Assert.assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOne() {
        Assert.assertEquals(FactorialCalculator.factorial(1), 1);
    }

    @DataProvider(name = "factorialData")
    public Object[][] factorialData() {
        return new Object[][]{
                {2, 2L},
                {3, 6L},
                {4, 24L},
                {5, 120L},
                {6, 720L}
        };
    }

    @Test(dataProvider = "factorialData")
    public void testFactorialWithDataProvider(int input, long expected) {
        Assert.assertEquals(FactorialCalculator.factorial(input), expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        FactorialCalculator.factorial(-1);
    }
}