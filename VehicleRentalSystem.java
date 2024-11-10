import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicle = new ArrayList<>();
        int choice = 0;

        do {
            System.out.println(
                    "\nVehicle Rental System" +
                    "\n1. Rent a Car" +
                    "\n2. Rent a Bike" +
                    "\n3. Rent a Truck" +
                    "\n4. View Rented Vehicles" +
                    "\n5. Exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String model = input.nextLine();
                    model = input.nextLine();
                    System.out.print("Enter Rental Days: ");
                    int days = input.nextInt();

                    Vehicle v1 = new Car(model, days);
                    rentedVehicle.add(v1);
                    System.out.println("\nRental Details: ");
                    v1.displayDetails();
                    break;

                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String brand = input.nextLine();
                    brand = input.nextLine();
                    System.out.print("Enter Rental Hours: ");
                    int hours = input.nextInt();

                    Vehicle b1 = new Bike(brand, hours);
                    rentedVehicle.add(b1);
                    System.out.println("\nRental Details: ");
                    b1.displayDetails();
                    break;

                case 3:
                    System.out.print("Enter Truck Type: ");
                    String type = input.nextLine();
                    type = input.nextLine();
                    System.out.print("Enter Rental Weeks: ");
                    int weeks = input.nextInt();

                    Vehicle t1 = new Truck(type, weeks);
                    rentedVehicle.add(t1);
                    System.out.println("\nRental Details: ");
                    t1.displayDetails();
                    break;

                case 4:
                    for (Vehicle v : rentedVehicle)
                        v.displayDetails();
                    break;
                    
                default: break;
            }
        } while (choice != 5);

        System.out.println("Thank you for using the Vehicle Rental System!");
    }
}
