import components.Car;
import components.Convertible;
import components.Suv;
import components.Wagon;
import components.Jeep;
import components.NullClass;
import components.Sedan;

public class CarRentalService {
    public Car rentCar(String carName){
        Car car;
        switch (carName) {
            case "Suv": car=new Suv();
                        break;
        
            case "Jeep": car=new Jeep();
                        break;

            case "Sedan": car=new Sedan();
                        break;

            case "Convertible": car=new Convertible();
                        break;

            case "Wagon": car=new Wagon();
                        break;
            default:
                car=new NullClass();
                break;
        }
        return car;
    }
}
