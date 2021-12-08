package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140EuroThen9800Rbl() {
        float in = 140;
        float expected = 8400;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140DlrThen9800Dlr() {
        float in = 140;
        float expected = 9800;
        float out = Converter.euroToRubles(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}