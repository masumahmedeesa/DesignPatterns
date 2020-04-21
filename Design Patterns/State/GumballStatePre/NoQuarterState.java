class NoQuarterState implements State {
    GumballMachine machine;

    NoQuarterState(GumballMachine machine){
        this.machine= machine;
    }
    public void insertQuarter(){
        System.out.println(this + ": Coin is inserted!");
        machine.setState(machine.getHasQuarterState());
    }
	public void ejectQuarter(){
        System.out.println(this + ": Can't eject because there is no COINS!");
        // machine.setState(machine.getNoQuarterState());
    }
    public void turnCrank(){
        System.out.println(this + ": No coin man! How can you pull this shit?");
        // machine.setState(machine.getSoldState());
    }
	public void dispense(){
        System.out.println(this + ": " + "Insert coin please!");
    }
	
	public void refill(int count){
        System.out.println("Can't refill");
    }

    public String toString(){
        return "NO_QUARTER";
    }
}