package com.maria;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, Maria");


		Driver driver = new Driver("Tom");
		Car car = new Car("Blue", driver);
		car.myColor();
		car.drive();

		Car mariaCar = new Car("Mar");
		mariaCar.myColor();

		Car nongCar = new Car("AnuchitO");
		nongCar.myColor();
	}
}
