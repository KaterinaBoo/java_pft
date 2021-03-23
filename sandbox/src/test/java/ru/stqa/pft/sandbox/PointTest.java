package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public void testDistance() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);
        Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
    }

    @Test
    public void testDistanceNegative() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);
        Assert.assertEquals(p1.distance(p2), 5);
    }

    @Test
    public void testDistanceSum() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);
        assert p1.distance(p2) == 2.8284271247461903;
    }

}
