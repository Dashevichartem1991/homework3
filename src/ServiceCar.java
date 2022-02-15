public class ServiceCar {


    public static void changeColor(Car newCar, String newColor) {
        for (CarColor col : CarColor.values()) {
            if (col.name().equals(newColor.toUpperCase())) {

                newCar.setCarColor(col);
            }
        }
    }

    public static void changeWheelSize(Car newCar, String newSize) {
        for (CarWheelSize whe : CarWheelSize.values()) {
            if (whe.name().equals(newSize.toUpperCase())) {

                newCar.setCarWheelSize(whe);
            }
        }
    }

    public static void changeCarOptions(Car newCar, String newOptions) {
        for (CarOptions opt : CarOptions.values()) {
            if (opt.name().equals(newOptions.toUpperCase())) {

                newCar.setCarOptions(opt);
            }
        }
    }


}
