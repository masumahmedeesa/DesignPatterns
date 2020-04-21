
import java.util.Random;

class HasQuarterState implements State {

    GumballMachine machine;

    HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    public void insertQuarter() {
        System.out.println(this + ": You have already inserted a quarter. Please Wait");
    }

    public void ejectQuarter() {
        System.out.println(this + ": Ejecting quarter");
        machine.setState(machine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println(this + ": Turning crank");
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        if (randomNumber == 7 && machine.getCount() >= 2) {
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println(this + ": " + "No gumball dispensed");
    }

    public void refill(int count) {
        System.out.println("Can't refill");
    }

    public String toString() {
        return "HAS_QUARTER";
    }
}
