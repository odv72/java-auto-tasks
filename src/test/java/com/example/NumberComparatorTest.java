package com.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberComparatorTest {

    @Test
    public void testCompareGreater() {
        Assert.assertEquals(NumberComparator.compare(10, 5), 1);
    }

    @Test
    public void testCompareEqual() {
        Assert.assertEquals(NumberComparator.compare(7, 7), 0);
    }

    @Test
    public void testCompareLess() {
        Assert.assertEquals(NumberComparator.compare(3, 8), -1);
    }

    @DataProvider(name = "compareData")
    public Object[][] compareData() {
        return new Object[][]{
                {5, 3, 1},
                {5, 5, 0},
                {3, 5, -1}
        };
    }

    @Test(dataProvider = "compareData")
    public void testCompareWithParameters(int a, int b, int expected) {
        Assert.assertEquals(NumberComparator.compare(a, b), expected);
    }

    @Test
    public void testIsGreaterThan() {
        Assert.assertTrue(NumberComparator.isGreaterThan(10, 5));
        Assert.assertFalse(NumberComparator.isGreaterThan(5, 10));
        Assert.assertFalse(NumberComparator.isGreaterThan(5, 5));
    }

    @Test
    public void testIsLessThan() {
        Assert.assertTrue(NumberComparator.isLessThan(5, 10));
        Assert.assertFalse(NumberComparator.isLessThan(10, 5));
        Assert.assertFalse(NumberComparator.isLessThan(5, 5));
    }

    @Test
    public void testAreEqual() {
        Assert.assertTrue(NumberComparator.areEqual(5, 5));
        Assert.assertFalse(NumberComparator.areEqual(5, 6));
        Assert.assertFalse(NumberComparator.areEqual(-5, 5));
    }
}