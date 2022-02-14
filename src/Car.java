public class Car<T1, T2, T3, T4,T5, T6> {

    private T1 color;
    private T2 model;
    private T3 yearOfIssue;
    private T4 wheelSize;
    private T5 engineCapacity;
    private T6 options;


    public Car(T1 color, T2 model, T3 yearOfIssue, T4 wheelSize, T5 engineCapacity, T6 options) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.engineCapacity = engineCapacity;
        this.options = options;
    }

    public T1 getColor() {
        return color;
    }

    public T2 getModel() {
        return model;
    }

    public T3 getYearOfIssue() {
        return yearOfIssue;
    }

    public T4 getWheelSize() {
        return wheelSize;
    }

    public T5 getEngineCapacity() {
        return engineCapacity;
    }

    public T6 getOptions() {
        return options;
    }

    public void setColor(T1 color) {
        this.color = color;
    }

    public void setWheelSize(T4 wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setOptions(T6 options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", model=" + model +
                ", yearOfIssue=" + yearOfIssue +
                ", wheelSize=" + wheelSize +
                ", engineCapacity=" + engineCapacity +
                ", options=" + options +
                '}';
    }
}
