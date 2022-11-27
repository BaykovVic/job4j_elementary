package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RubleToEuro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void whenConvert120RubleToDollar() {
        float in = 120;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);

    }
}