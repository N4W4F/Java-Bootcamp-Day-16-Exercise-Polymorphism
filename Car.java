public class Car implements Vehicle {

    private String model;
    private int days;

    public Car() {}

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public int getDays() {
        return days;
    }

    @Override
    public double calculateRentalCost() {
        return getDays() * 50;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "\nCar Model: " + getModel() +
                "\nDaily Rental Rate: $50" +
                "\nRental Cost: $" + calculateRentalCost());
    }
}
