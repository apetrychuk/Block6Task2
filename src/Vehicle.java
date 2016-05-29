/**
 * Created by Андрей on 29.05.2016.
 */
public abstract class Vehicle {
    public String licensePlane;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlane='" + licensePlane + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getLicensePlane() {
        return licensePlane;
    }

    public void setLicensePlane(String licensePlane) {
        this.licensePlane = licensePlane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (licensePlane != null ? !licensePlane.equals(vehicle.licensePlane) : vehicle.licensePlane != null)
            return false;
        return name != null ? name.equals(vehicle.name) : vehicle.name == null;

    }

    @Override
    public int hashCode() {
        int result = licensePlane != null ? licensePlane.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    abstract void move();
}
