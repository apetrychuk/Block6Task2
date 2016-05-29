/**
 * Created by Андрей on 29.05.2016.
 */
public class Motocycle extends Vehicle{
    public Motocycle(String name, String licensePlate) {
        this.name = name;
        this.licensePlane = licensePlate;
        move();
    }

    @Override
    public void move(){
        System.out.println(this.toString() + " moving");
    }

    @Override
    public String toString() {
        return "Motocycle{Name: " + getName() +
                ", License Plate: " + getLicensePlane() +
                "}";
    }


}
