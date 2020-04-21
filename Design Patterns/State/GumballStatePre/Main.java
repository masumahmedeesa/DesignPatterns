interface State{
    public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
    public void dispense();
    public void refill(int count);
    // public void winnerState();
}

class Main{
    public static void main(String[] args){

        GumballMachine machine = new GumballMachine(5);
        System.out.println(machine);
        machine.ejectQuarter();
        machine.insertQuarter();
        System.out.println(machine.getState());
        machine.ejectQuarter();
        machine.insertQuarter();
        machine.turnCrank();
        machine.turnCrank();
        System.out.println(machine.getState());
    }
}