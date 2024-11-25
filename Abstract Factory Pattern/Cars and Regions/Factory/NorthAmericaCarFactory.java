package Factory;

import Cars.Car;
import Cars.Sedan;
import Regions.CarSpecification;
import Regions.NorthAmericaSpecification;

public class NorthAmericaCarFactory implements CarFactory{
    public Car createCar(){
        return new Sedan();
    }

    public CarSpecification createCarSpecification(){
        return new NorthAmericaSpecification();
    }
}
