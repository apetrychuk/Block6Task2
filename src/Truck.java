/**
 * Created by Андрей on 29.05.2016.
 */
public class Truck extends Vehicle{
    public int carryingCapacity;

    Truck(String name, String licensePlate, int carryingCapacity){
        this.name = name;
        this.licensePlane = licensePlate;
        this.carryingCapacity = carryingCapacity;
        move();
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void move(){
        System.out.println(this.toString() + " moving");
    }

    @Override
    public String toString() {
        return "Truck{Name: " + getName() +
                ", License Plate: " + getLicensePlane() +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Truck truck = (Truck) o;

        return carryingCapacity == truck.carryingCapacity;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + carryingCapacity;
        return result;
    }
}
