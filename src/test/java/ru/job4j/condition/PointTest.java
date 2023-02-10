package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to24then3() {
        Point a = new Point(2, 1);
        Point b = new Point(2, 4);
        double expected = 3;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to01then1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        double expected = 1;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40to80then4() {
        Point a = new Point(4, 0);
        Point b = new Point(8, 0);
        double expected = 4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when400to800then4() {
        Point a = new Point(4, 0, 0);
        Point b = new Point(8, 0, 0);
        double expected = 4;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when001to003then2() {
        Point a = new Point(0, 0, 1);
        Point b = new Point(0, 0, 3);
        double expected = 2;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}