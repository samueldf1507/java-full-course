package unifor.poo.activity2.domain;

public class Elevator {
    private int currentFloor;
    private int totalFloors;
    private int elevatorMaxCapacity;
    private int numberOfPeopleAtTheElevator;


    public Elevator() {
        this.totalFloors = 20;
        this.elevatorMaxCapacity = 10;
        this.currentFloor = 0;
        this.numberOfPeopleAtTheElevator = 0;
    }

    public void enter() {
        if (numberOfPeopleAtTheElevator < elevatorMaxCapacity) {
            this.numberOfPeopleAtTheElevator++;
            System.out.println("Uma pessoa acaba de entrar no elevador");
            System.out.println("Número de pessoas no elevador: " + this.numberOfPeopleAtTheElevator);
        } else {
            System.out.println("O elevador está cheio, não é mais possível adicionar ninguem");
        }
    }

    public void leave() {
        if (numberOfPeopleAtTheElevator > 0) {
            this.numberOfPeopleAtTheElevator--;
            System.out.println("Uma pessoa acaba de sair no elevador");
            System.out.println("Número de pessoas no elevador: " + this.numberOfPeopleAtTheElevator);
        }  else {
            System.out.println("O elevador está vazio, não é possível que alguem saia do elevador");
        }
    }

    public void goUp() {
        if (this.currentFloor == this.totalFloors) {
            System.out.println("O elevador está no último andar, não é possível subir mais um andar");
        } else {
            this.currentFloor++;
            System.out.println("O elevador acabou de subir um andar");
            System.out.println("Andar atual: " + this.currentFloor);
        }
        
    }

    public void goDown() {
        if (this.currentFloor == 0) {
            System.out.println("O elevador está no terreo, não é possível descer mais um andar");
        } else {
            this.currentFloor--;
            System.out.println("O elevador acabou de descer um andar");
            System.out.println("Andar atual: " + this.currentFloor);
        }
    }

    public void printElevatorInformations() {
        System.out.println("Andar atual: " + this.currentFloor);
        System.out.println("Número de pessoas no elevador: " + this.numberOfPeopleAtTheElevator);
        System.out.println("Capacidade máxima do elevador: " + this.elevatorMaxCapacity);
        System.out.println("Quantidade de andrares: " + this.totalFloors);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public int getElevatorMaxCapacity() {
        return elevatorMaxCapacity;
    }

    public void setElevatorMaxCapacity(int elevatorMaxCapacity) {
        this.elevatorMaxCapacity = elevatorMaxCapacity;
    }

    public int getNumberOfPeopleAtTheElevator() {
        return numberOfPeopleAtTheElevator;
    }

    public void setNumberOfPeopleAtTheElevator(int numberOfPeopleAtTheElevator) {
        this.numberOfPeopleAtTheElevator = numberOfPeopleAtTheElevator;
    }
}
