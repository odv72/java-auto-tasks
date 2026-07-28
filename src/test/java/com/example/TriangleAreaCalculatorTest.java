package com.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleAreaCalculatorTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testRightTriangle() {
        Assert.assertEquals(TriangleAreaCalculator.calculateArea(3, 4, 5), 6.0, DELTA);
    }

    @Test
    public void testEquilateralTriangle() {
        Assert.assertEquals(TriangleAreaCalculator.calculateArea(1, 1, 1), 0.4330, DELTA);
    }

    @DataProvider(name = "triangleData")
    public Object[][] triangleData() {
        return new Object[][]{
                {3.0, 4.0, 5.0, 6.0},
                {5.0, 5.0, 6.0, 12.0},
                {6.0, 8.0, 10.0, 24.0}
        };
    }

    @Test(dataProvider = "triangleData")
    public void testTriangleArea(double a, double b, double c, double expected) {
        Assert.assertEquals(TriangleAreaCalculator.calculateArea(a, b, c), expected, DELTA);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeSide() {
        TriangleAreaCalculator.calculateArea(-1, 2, 3);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNotATriangle() {
        TriangleAreaCalculator.calculateArea(1, 2, 10);
    }
}