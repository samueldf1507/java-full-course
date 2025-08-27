package unifor.poo.activity2.test;

import unifor.poo.activity2.domain.Elevator;

import java.util.Random;

public class ElevatorMain {
    public static void main(String[] args) {

        /*
          O prédio possui 20 andares
          10 é o número máximo de pessoas que cabem no elevador
         */

        Elevator elevator = new Elevator();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int action = random.nextInt(4);

            switch (action) {
                case 0:
                    elevator.enter();
                    break;
                case 1:
                    elevator.goUp();
                    break;
                case 2:
                    elevator.leave();
                    break;
                case 3:
                    elevator.goDown();
                    break;
            }

        }
        System.out.println("============================================");
        elevator.printElevatorInformations();

    }
}
