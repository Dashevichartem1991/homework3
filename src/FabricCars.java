public class FabricCars extends ServiceCar{
    public static void main(String[] args) {
        Car firstCar = new Car(1999, CarColor.RED,CarModel.AUDI,CarEngineCapacity.BIG,CarWheelSize.BIG,CarOptions.CLIMATE_CONTROL);

        System.out.println(firstCar.toString());

        changeColor(firstCar,"black");
        changeWheelSize(firstCar,"small");
        changeCarOptions(firstCar,"USB");

        System.out.println(firstCar.toString());
    }


}
