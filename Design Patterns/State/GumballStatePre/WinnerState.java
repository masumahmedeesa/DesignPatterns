class WinnerState implements State{
    GumballMachine machine;
    WinnerState(GumballMachine machine){
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
        System.out.println(this + ": " + "You have won");
        machine.releaseBall();
        machine.releaseBall();
        if(machine.getCount() > 0 ){
            machine.setState(machine.getNoQuarterState());
        } else{
            System.out.println(this + ": No Gumball Actually! Sorry");
            machine.setState(machine.getSoldOutState());
        }
    }
	
	public void refill(int count){
        System.out.println("Can't refilled!");
    }

    public String toString(){
        return "Winning_State";
    }

}