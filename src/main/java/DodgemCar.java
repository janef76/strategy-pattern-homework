public class DodgemCar extends Vehicle{

    private int numOfSeats;

    public DodgemCar(int averageSpeed, int distance, int numOfSeats) {
        super(averageSpeed, distance);
        this.numOfSeats = numOfSeats;
    }

    public int getAverageSpeed() {
        return this.averageSpeed;
    }

    public int getDistance() {
        return super.getDistance();
    }

    public int getNumOfSeats() {
        return this.numOfSeats;
    }

    @Override
    public int driveDistance() {
        return distance/averageSpeed;
    }
}
