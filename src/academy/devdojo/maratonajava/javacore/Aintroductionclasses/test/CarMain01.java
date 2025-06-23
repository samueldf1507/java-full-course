package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Car;

public class CarMain01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Mercedes";
        car1.model = "C180";
        car1.releaseYear = 2018;

        Car car2 = new Car();
        car2.brand = "Mustang";
        car2.model = "GT500";
        car2.releaseYear = 2020;

        car2 = car1;

        System.out.println(car1.brand + " | " + car1.model + " | " + car1.releaseYear);
        System.out.println(car2.brand + " | " + car2.model + " | " + car2.releaseYear);
    }
}
