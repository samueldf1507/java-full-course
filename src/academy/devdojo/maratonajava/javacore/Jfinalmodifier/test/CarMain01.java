package academy.devdojo.maratonajava.javacore.Jfinalmodifier.test;

import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Buyer;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Ferrari;

public class CarMain01 {
    public static void main(String[] args) {
        Car car = new Car();
        Buyer buyer = new Buyer();

        System.out.println(Car.SPEED_LIMIT);
        car.BUYER.setName("Kuririn");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo ");
        ferrari.printCar();
    }
}
