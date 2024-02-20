package org.example.builder;

public class Director {
    public void constructCar(Builder builder){
        builder.setCarType("Sports_CAR");
        builder.setSeats(4);
        builder.setEngine("2.5");
    }
    public void constructManuel(Builder builder){
        builder.setCarType("Manuel_CAR");
        builder.setSeats(6);
        builder.setEngine("1.6");
    }
}
