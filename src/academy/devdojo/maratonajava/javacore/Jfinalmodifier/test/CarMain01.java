package academy.devdojo.maratonajava.javacore.Jfinalmodifier.test;

import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Buyer;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;

public class CarMain01 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Velocidade limite: " + Car.SPEED_LIMIT);
        car.BUYER.setName("Kuririn");
        System.out.println(car.BUYER);
    }
}
