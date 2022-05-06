package katatraining;

public abstract class  Car {

    private Integer milage;
    private String seats;
    private boolean isSedan;

    public Car(Integer milage, String seats, boolean isSedan) {
        this.milage = milage;
        this.seats = seats;
        this.isSedan = isSedan;
    }

    public Integer getMilage() {
        return milage;
    }

    public String getSeats() {
        return seats;
    }

    public boolean isSedan() {
        return isSedan;
    }
}
