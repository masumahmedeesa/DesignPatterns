
class SoldOutState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println(this + ": " + "Please wait, we're already giving you a gumball");
	}
 
	public void ejectQuarter() {
		System.out.println(this + ": " + "Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println(this + ": " + "Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		System.out.println(this + ": " + "No gumball dispensed");
	}
	
    public void refill(int count) { 
        System.out.println(this + ": " + "Gumball refilled");
        gumballMachine.setCount(count);
    }
 
	public String toString() {
		return "SOLD_OUT";
	}
}