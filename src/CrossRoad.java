import java.util.ArrayList;

/**
 * Created by Андрей on 29.05.2016.
 */
public class CrossRoad {
    public String name;
    ArrayList<Vehicle> vehicles;
    private int carCounter;
    private int truckCounter;
    private int motocycleCounter;

    CrossRoad(String name){
        this.name = name;
        vehicles = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicles(Vehicle tmp) {
        this.vehicles.add(tmp);
    }

    public void printVehicles(){
        for (Vehicle tmp: this.vehicles) {
            System.out.println(tmp);

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarCounter() {

        return carCounter;
    }

    public void setCarCounter(int carCounter) {
        this.carCounter = carCounter;
    }

    public int getTruckCounter() {
        return truckCounter;
    }

    public void setTruckCounter(int routeTruckcounter) {
        this.truckCounter = routeTruckcounter;
    }

    public int getMotocycleCounter() {
        return motocycleCounter;
    }

    public void setMotocycleCounter(int routeMotocyclecounter) {
        this.motocycleCounter = routeMotocyclecounter;
    }

    protected void countVehicles(){
        for (Vehicle tmp: this.vehicles) {
            if (tmp instanceof Car){
                carCounter++;
            }else if (tmp instanceof Truck){
                truckCounter++;
            }else if (tmp instanceof Motocycle){
                motocycleCounter++;
            }
        }
    }


    public boolean isMotocycle(Vehicle tmp){
        if (this.getVehicles().contains(tmp)){
            return true;
        }
        return false;

    }
}
