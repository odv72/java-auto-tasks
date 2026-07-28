package com.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArithmeticCalculatorTest {

    @Test
    public void testAddition() {
        Assert.assertEquals(ArithmeticCalculator.add(10, 5), 15);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(ArithmeticCalculator.subtract(10, 5), 5);
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(ArithmeticCalculator.multiply(10, 5), 50);
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(ArithmeticCalculator.divide(10, 5), 2.0);
    }

    @DataProvider(name = "arithmeticData")
    public Object[][] arithmeticData() {
        return new Object[][]{
                {5, 3, 8, 2, 15, 1.6666666666666667},
                {10, 2, 12, 8, 20, 5.0}
        };
    }

    @Test(dataProvider = "arithmeticData")
    public void testAllOperations(int x, int y, int sum, int diff, int product, double quotient) {
        Assert.assertEquals(ArithmeticCalculator.add(x, y), sum);
        Assert.assertEquals(ArithmeticCalculator.subtract(x, y), diff);
        Assert.assertEquals(ArithmeticCalculator.multiply(x, y), product);
        Assert.assertEquals(ArithmeticCalculator.divide(x, y), quotient, 0.0001);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        ArithmeticCalculator.divide(10, 0);
    }
}