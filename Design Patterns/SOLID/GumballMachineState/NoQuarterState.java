
class NoQuarterState implements State{

    GumballMachine machine;

    NoQuarterState(GumballMachine machine){
        this.machine = machine;
    }

    public void insertQuarter(){
        System.out.println(this + ": Coin is inserted");
        machine.setState(machine.getHasQuarterState());
    }
	public void ejectQuarter(){
        System.out.println(this + ": Can't eject. No coin is inserted");
    }
    public void turnCrank(){
        System.out.println(this + ": Please insert coin first");
    }
	public void dispense(){
        System.out.println(this + ": Please insert coin first");
    }
	
    public void refill(int count) {
        System.out.println("Can't refill");
    }

    public String toString(){
        return "NO_QUARTER";
    }
}