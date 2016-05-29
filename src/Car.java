/**
 * Created by Андрей on 29.05.2016.
 */
public class Car extends Vehicle {

    Car(String name, String licensePlate){
        this.name = name;
        this.licensePlane = licensePlate;
        move();
    }

    @Override
    public void move(){
        System.out.println(this.toString() +  " moving");
    }

    @Override
    public String toString() {
        return "Car{Name: " + getName() +
                ", License Plate: " + getLicensePlane() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
