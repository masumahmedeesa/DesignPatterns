class SoldOutState implements State{
    
    GumballMachine machine;

    SoldOutState(GumballMachine machine){
        this.machine = machine;
    }

    public void insertQuarter(){
        System.out.println(this + ": You are already given ball");
        // machine.setState(machine.getHasQuarterState());
    }
	public void ejectQuarter(){
        System.out.println(this + ": You lost the oppurtunity!");
        // machine.setState(machine.getNoQuarterState());
    }
    public void turnCrank(){
        System.out.println(this + ": How can you turn this when you are out of coins!");
        // machine.setState(machine.getSoldState());
    }
	public void dispense(){
        System.out.println(this + ": " + "Nothing will be happened!");
    }
	
	public void refill(int count){
        System.out.println("Gamball will be refilled!");
    }

    public String toString(){
        return "SOLD_OUT";
    }
}