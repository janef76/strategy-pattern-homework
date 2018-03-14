import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;
    DodgemCar dodgemCar;

    @Before
    public void before() {
        dodgemCar = new DodgemCar(26, 20, 2 );
        driver = new Driver("Jane",dodgemCar);
    }

    @Test
    public void hasName() {
        assertEquals("Jane", driver.getName());
    }

    @Test
    public void hasDodgemCar() {
        assertEquals(dodgemCar, driver.getDrive());
    }

    @Test
    public void getAverageSpeed() {
        assertEquals(26, dodgemCar.getAverageSpeed());
    }

    @Test
    public void getDistanceCovered() {
        assertEquals(20, dodgemCar.getDistance());
    }
    @Test
    public void getNumberOfSeats() {
        assertEquals(2, dodgemCar.getNumOfSeats());
    }

    @Test
    public void canSetDriver() {
        QuadBike quadBike = new QuadBike(20, 60, 400);
        driver.setDrive(quadBike);
        assertEquals(3, driver.driveDistance());
    }
}
