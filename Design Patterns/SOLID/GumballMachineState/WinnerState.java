
class WinnerState implements State {

	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
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
		System.out.println("Tumi jitso");
		gumballMachine.releaseBall();
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println(this + ": " + "Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	public void refill(int count) {
		System.out.println("Can't refill");
	}

	public String toString() {
		return "winnging_state";
	}
}