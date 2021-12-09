package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when450to8712then43dot68() {
        double expected = 43.68;
        int x1 = 45;
        int y1 = 0;
        int x2 = 87;
        int y2 = 12;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when214to143then16dot27() {
        double expected = 16.27;
        int x1 = 2;
        int y1 = 14;
        int x2 = 14;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to11then1dot41() {
        double expected = 1.41;
        int x1 = 2;
        int y1 = 2;
        int x2 = 1;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}