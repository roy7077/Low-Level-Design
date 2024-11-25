package Factory;

import Cars.Car;
import Cars.Hatchback;
import Regions.CarSpecification;
import Regions.EuropeSpecification;

public class EuropeCarFactory implements CarFactory{
    public Car createCar(){
        return new Hatchback();
    }

    public CarSpecification createCarSpecification(){
        return new EuropeSpecification();
    }
}
