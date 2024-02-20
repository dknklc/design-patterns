package org.example.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructCar(builder);
        System.out.println(builder.getResult().getCarType());

        CarManuelBuilder manuelBuilder = new CarManuelBuilder();
        director.constructManuel(manuelBuilder);
        System.out.println(manuelBuilder.getResult().getCarType());

    }
}
