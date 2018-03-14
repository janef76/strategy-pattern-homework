import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    DodgemCar dodgemCar;

    @Before
    public void before() {
        dodgemCar = new DodgemCar(40, 20, 2);
    }

    @Test
    public void getAverageSpeed() {
        assertEquals(40, dodgemCar.getAverageSpeed());
    }

    @Test
    public void getDistanceCovered() {
        assertEquals(20, dodgemCar.getDistance());
    }

    @Test
    public void getNumberOfSeats() {
        assertEquals(2, dodgemCar.getNumOfSeats());
    }
}
