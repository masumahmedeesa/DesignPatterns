/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Chicki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GumballMachine machine = new GumballMachine(5);
       System.out.println(machine);
       machine.ejectQuarter();
       machine.insertQuarter();
       System.out.println(machine.getState());
       machine.ejectQuarter();
       machine.insertQuarter();
       machine.turnCrank();
       System.out.println(machine.getState());
       
    }
    
}
