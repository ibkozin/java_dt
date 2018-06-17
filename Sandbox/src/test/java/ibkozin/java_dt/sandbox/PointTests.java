package ibkozin.java_dt.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance() {
        Point p1 = new Point(2, 4);
        Point p2 = new Point(4, 8);
        Assert.assertEquals(p1.distance(p2), 4.47213595499958);
    }

}
