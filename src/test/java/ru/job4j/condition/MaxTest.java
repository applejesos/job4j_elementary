package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax16To12Then16() {
        int left = 16;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 16;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To12Then12() {
        int left = 3;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12To12ThenAny() {
        int left = 12;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }
}