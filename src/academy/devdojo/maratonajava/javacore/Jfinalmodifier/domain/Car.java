package academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain;

public  class Car {
    private String name;
    //public static final double SPEED_LIMIT = 250;
    public static final double SPEED_LIMIT;
    public final Buyer BUYER = new Buyer();
    static {
        SPEED_LIMIT = 180;
    }

    public final void printCar() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
