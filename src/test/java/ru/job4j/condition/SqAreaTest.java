package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP18K1Square20dot25() {
        double expected1 = 20.25;
        int p = 18;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected1, out, 0.01);
    }

    @Test
    public void whenP76K10Square119() {
        double expected2 = 119.33;
        int p = 76;
        double k = 10;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected2, out, 0.01);
    }
}