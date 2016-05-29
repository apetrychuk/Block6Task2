/**
 * Created by Андрей on 29.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        CrossRoad crossRoad = new CrossRoad("street Vadyma Hetmana - avenue Peremohy");
        CrossRoad crossRoad1 = new CrossRoad("street Zhytomyrska - street Volodymyrska");

        crossRoad.addVehicles(new Car("BMW","AC 7894 ПМ"));
        crossRoad.addVehicles(new Car("Seat","AМ 0404 ЛП"));
        crossRoad.addVehicles(new Truck("Volvo", "ВК 4561 СМ", 5000));
        crossRoad.addVehicles(new Truck("Reno", "ВК 4561 СМ", 10000));
        crossRoad.addVehicles(new Motocycle("Ducati", "СА 8000 АК"));
        crossRoad.addVehicles(new Motocycle("Ducati", "СА 7788 МС"));
        crossRoad.addVehicles(new Motocycle("Yamaha", "СА 234-34 В"));
        crossRoad1.addVehicles(new Motocycle("Suzuki", "МС 8000 МР"));
        crossRoad1.addVehicles(new Car("KIA", "АЛ 0007 СТ"));

        crossRoad.countVehicles();

        System.out.println(crossRoad.getCarCounter() + " Cars have moved on the crossroad: " + crossRoad.getName());
        System.out.println(crossRoad.getTruckCounter() + " Trucks have moved on the crossroad: " + crossRoad.getName());
        System.out.println(crossRoad.getMotocycleCounter() + " Motocycles have moved on the crossroad: " + crossRoad.getName());
        System.out.println("Existence Motocycle YAMAHA, License Plate: \"СА 234-34\" В on the crossroad: "+ crossRoad.getName() + " - " +
                crossRoad.isMotocycle(new Motocycle("Yamaha", "СА 234-34 В")));




    }
}
