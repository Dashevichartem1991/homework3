import java.util.ArrayList;

public class FabricCars extends Car{


    public FabricCars(Integer year, CarColor carColor, CarModel carModel, CarEngineCapacity carEngineCapacity, CarWheelSize carWheelSize) {
        super(year, carColor, carModel, carEngineCapacity, carWheelSize);
    }

    public FabricCars(Integer year, CarColor carColor, CarModel carModel, CarEngineCapacity carEngineCapacity, CarWheelSize carWheelSize, CarOptions carOptions) {
        super(year, carColor, carModel, carEngineCapacity, carWheelSize, carOptions);
    }

    public static void listCarColor(){
        System.out.println("Доступные цвета");
        for (CarColor col : CarColor.values()) {
            System.out.println(col);
        }
    }

    public static void listCarModel(){
        System.out.println("Доступные модели");
        for (CarModel mod : CarModel.values()) {
            System.out.println(mod);
        }
    }

    public static void listCarOptions(){
        System.out.println("Доступные опции");
        for (CarOptions opt : CarOptions.values()) {
            System.out.println(opt);
        }
    }
    public static void listCarWheeSize(){
        System.out.println("Доступные колеса");
        for (CarWheelSize whe : CarWheelSize.values()) {
            System.out.println(whe);
        }
    }

    public static void listCarEngineCapacity(){
        System.out.println("Доступные двигателя");
        for (CarEngineCapacity eng : CarEngineCapacity.values()) {
            System.out.println(eng);
        }
    }
     private ArrayList<FabricCars> storage = new ArrayList<>();
    public void addStorage(FabricCars newCar){

        storage.add(newCar);
        System.out.println("Машина добавлена на склад");
        System.out.println(storage.toString());

    }
   public void createCar(FabricCars createCar) {
       for (FabricCars test: storage) {
           System.out.println(test.equals(createCar));
           if(test.equals(createCar)){
               System.out.println("Вы купили машину со склада");
               storage.remove(test);
           }
           
       }


       System.out.println("Заказ выполнен");
   }



}
