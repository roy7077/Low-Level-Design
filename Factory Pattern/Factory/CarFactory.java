package Factory;

import Cars.Car;
import Regions.CarSpecification;

public interface CarFactory {
    Car createCar();
    CarSpecification createCarSpecification();
}

