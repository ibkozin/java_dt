package ibkozin.java_dt.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance() {
        Point p1 = new Point(2, 4);
        Point p2 = new Point(4, 6);
        Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
    }

}
