package org.example.builder;

public class Manuel {
    private final String carType;
    private final int seats;
    private final String engine;

    public Manuel(String carType, int seats, String engine) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
    }

    public String getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }
}
