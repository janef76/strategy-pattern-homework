import com.sun.xml.internal.bind.v2.model.core.ID;

public class Driver {
    String name;
    IDrive driveDistance;

    public Driver(String name, IDrive driveDistance) {
        this.name = name;
        this.driveDistance = driveDistance;
    }

    public String getName() {
        return this.name;
    }

    public IDrive getDrive() {
        return this.driveDistance;
    }

    public int driveDistance() {
        return this.driveDistance.driveDistance();
    }

    public void setDrive(IDrive driveDistance) {
        this.driveDistance = driveDistance;
    }
}
