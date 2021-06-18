package com.maria;

public class Car {
    private Driver drive;
    private String color;

   public Car() {}

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Driver driver) {
        this.color = color;
        this.drive = driver;
    }


    public void myColor() {
        System.out.println(color + " is my color");
    }

    public void drive() {
        System.out.println(this.drive.getName() + " driving a car color " + this.color);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
