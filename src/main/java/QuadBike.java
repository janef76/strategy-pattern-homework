public class QuadBike extends Vehicle {

    private int engCapCC;

    public QuadBike(int averageSpeed, int distance, int engCapCC) {
        super(averageSpeed, distance);
        this.engCapCC = engCapCC;
    }

    public int getAverageSpeed() {
        return this.averageSpeed;
    }

    public int getDistance() {
        return super.getDistance();
    }

    public int getEngCapCC() {
        return this.engCapCC;
    }

    @Override
    public int driveDistance() {
        return distance/averageSpeed;
    }
}
