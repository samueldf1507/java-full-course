package academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private static double speedLimit = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;

    }

    public void printCar() {
        System.out.println("-------");
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade máxima: " + this.maxSpeed);
        System.out.println("Velocidade limite: " + Car.speedLimit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }

    public static double getSpeedLimit() {
        return Car.speedLimit;
    }



}
