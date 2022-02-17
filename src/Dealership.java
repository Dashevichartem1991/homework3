public class Dealership implements CarService {


    public static void main(String[] args) {

        // Списки доступных характиристик машины
        FabricCars.listCarColor();
        FabricCars.listCarModel();
        FabricCars.listCarEngineCapacity();
        FabricCars.listCarOptions();
        FabricCars.listCarWheeSize();

        //Создание машин для склада
        FabricCars firsCar = new FabricCars(1992,CarColor.BLACK, CarModel.AUDI, CarEngineCapacity.BIG, CarWheelSize.BIG);
        FabricCars secondCar = new FabricCars(1992,CarColor.YELLOW, CarModel.AUDI, CarEngineCapacity.BIG, CarWheelSize.BIG);
        FabricCars thirdCar =  new FabricCars(1992,CarColor.GRAY, CarModel.AUDI, CarEngineCapacity.BIG, CarWheelSize.BIG);
        //Добавление на склад машин
      firsCar.addStorage(firsCar);
      secondCar.addStorage(secondCar);
      thirdCar.addStorage(thirdCar);


        FabricCars fabricCars = new FabricCars(1992,CarColor.GRAY, CarModel.AUDI, CarEngineCapacity.BIG, CarWheelSize.BIG);
        //Проверка наличия на складе машины
        fabricCars.createCar(fabricCars);
        // Изменение опций машины
       System.out.println(fabricCars.toString());
       CarService.changeColor(fabricCars, "Blue");
       CarService.changeCarOptions(fabricCars, "USB");
       CarService.changeWheelSize(fabricCars, "BIG");

       System.out.println(fabricCars.toString());





    }
}
