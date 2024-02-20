package org.example.builder;

public class CarManuelBuilder implements Builder{

    private String carType;
    private int seats;
    private String engine;

    @Override
    public void setCarType(String type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Manuel getResult(){
        return new Manuel(carType, seats, engine);
    }
}
