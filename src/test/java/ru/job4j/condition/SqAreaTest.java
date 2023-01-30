package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP16K1Square16() {
        double p = 16;
        double k = 1;
        double expected = 16;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K3Square27() {
        double p = 24;
        double k = 3;
        double expected = 27;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}