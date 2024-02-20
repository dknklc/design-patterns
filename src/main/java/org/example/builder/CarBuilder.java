package org.example.builder;

public class CarBuilder implements Builder{
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

    public Car getResult(){
        return new Car(carType, seats, engine);
    }
}
