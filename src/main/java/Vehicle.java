public abstract class Vehicle implements IDrive{
    int averageSpeed;
    int distance;

    public Vehicle(int averageSpeed, int distance) {
        this.averageSpeed = averageSpeed;
        this.distance = distance;
    }

    public int getAverageSpeed() {
        return this.averageSpeed;
    }

    public int getDistance() {
        return this.distance;
    }
}
