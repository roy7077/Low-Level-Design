import Cars.Car;
import Factory.CarFactory;
import Factory.EuropeCarFactory;
import Factory.NorthAmericaCarFactory;
import Regions.CarSpecification;

public class CarFactoryClient {
    public static void main(String[] args) {
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createCarSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        // Creating cars for Europe
        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createCarSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
