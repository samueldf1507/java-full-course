package academy.devdojo.maratonajava.javacore.Fstaticmodifier.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain.Car;

public class CarMain01 {
    public static void main(String[] args) {
        Car.setSpeedLimit(300);
        Car car1 = new Car("BMW", 280);
        Car car2 = new Car("Mercedes", 275);
        Car car3 = new Car("Audi", 290);

        System.out.println(Car.getSpeedLimit());

        car1.printCar();

        car2.printCar();

        car3.printCar();

    }
}
