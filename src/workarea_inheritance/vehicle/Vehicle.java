package workarea_inheritance.vehicle;

public abstract class Vehicle {
    final String make;
    final String model;
    final int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
