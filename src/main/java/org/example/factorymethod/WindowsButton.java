package org.example.factorymethod;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows Test Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello Windows Button'");

    }
}
