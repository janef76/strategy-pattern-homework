import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {

    QuadBike quadBike;

    @Before
    public void before() {
        quadBike = new QuadBike(20, 4, 400);
    }

    @Test
    public void getAverageSpeed() {
        assertEquals(20, quadBike.getAverageSpeed());
    }

    @Test
    public void getDistanceCovered() {
        assertEquals(4, quadBike.getDistance());
    }

    @Test
    public void getNumberOfSeats() {
        assertEquals(400, quadBike.getEngCapCC());
    }
    }

