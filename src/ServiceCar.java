public class ServiceCar {

    public static void main(String[] args) {

        Car<String, String, Integer, Float, Float, String> firstCar = new Car<>("Red", "Emgrand7", 2020,16.0F,1.6F, "condition");
        System.out.println(firstCar.toString());

        firstCar.setColor("Blue");
        firstCar.setWheelSize(22.0F);
        firstCar.setOptions("Climat Control");

        System.out.println(firstCar.toString());


    }
}
