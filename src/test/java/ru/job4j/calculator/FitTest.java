package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double mExpected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(mExpected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double wExpected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(wExpected, out, 0.01);
    }
}