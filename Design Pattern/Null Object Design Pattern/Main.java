import java.util.Scanner;
import components.Car;

public class Main {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();
        Scanner sc = new Scanner(System.in); 
        while (true) {
            System.out.println("Tell me your car name that you want to rent:");
            String carName = sc.nextLine();

            Car car = carRentalService.rentCar(carName);

            // Drive car
            car.drive();

            // Stop car
            car.stop();
        }
    }
}
