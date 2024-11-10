public class Bike implements Vehicle {

    private String brand;
    private int hour;

    public Bike() {}

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public int getHour() {
        return hour;
    }

    @Override
    public double calculateRentalCost() {
        return 10 * getHour();
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "\nBike Brand: " + getBrand() +
                "\nHourly Rental Rate: $10" +
                "\nRental Cost: $" + calculateRentalCost());
    }
}
