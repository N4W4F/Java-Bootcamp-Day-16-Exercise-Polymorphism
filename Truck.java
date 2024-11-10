public class Truck implements Vehicle {

    private String type;
    private int week;

    public Truck() {}

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public int getWeek() {
        return week;
    }

    @Override
    public double calculateRentalCost() {
        return 500 * getWeek();
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "\nTruck Type: " + getType() +
                "\nWeekly Rental Rate: $500" +
                "\nRental Cost: $" + calculateRentalCost());
    }
}
