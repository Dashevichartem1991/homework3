import java.util.Arrays;

public class Car {

    private Integer year;
    private CarColor carColor;
    private CarModel carModel;
    private CarEngineCapacity carEngineCapacity;
    private CarWheelSize carWheelSize;
    private CarOptions carOptions;

    public Car(Integer year, CarColor carColor, CarModel carModel, CarEngineCapacity carEngineCapacity, CarWheelSize carWheelSize) {
        this.year = year;
        this.carColor = carColor;
        this.carModel = carModel;
        this.carEngineCapacity = carEngineCapacity;
        this.carWheelSize = carWheelSize;

    }

    public Car(Integer year, CarColor carColor, CarModel carModel, CarEngineCapacity carEngineCapacity, CarWheelSize carWheelSize, CarOptions carOptions) {
        this.year = year;
        this.carColor = carColor;
        this.carModel = carModel;
        this.carEngineCapacity = carEngineCapacity;
        this.carWheelSize = carWheelSize;
        this.carOptions = carOptions;
    }

    public Integer getYear() {
        return year;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public CarEngineCapacity getCarEngineCapacity() {
        return carEngineCapacity;
    }

    public CarWheelSize getCarWheelSize() {
        return carWheelSize;
    }

    public CarOptions getCarOptions() {
        return carOptions;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public void setCarWheelSize(CarWheelSize carWheelSize) {
        this.carWheelSize = carWheelSize;
    }

    public void setCarOptions(CarOptions carOptions) {
        this.carOptions = carOptions;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", carColor=" + carColor +
                ", carModel=" + carModel +
                ", carEngineCapacity=" + carEngineCapacity +
                ", carWheelSize=" + carWheelSize +
                ", carOptions=" + carOptions +
                '}';
    }
}
