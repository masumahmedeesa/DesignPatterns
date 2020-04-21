class mainClass{

    public static void main(String[] args){
        Remote remote = new Remote();

        Light light = new Light();
        Commands lightOnHobe = new LightOn(light);
        Commands lightOffHobe = new LightOff(light);
        remote.setCommand(1, lightOnHobe, lightOffHobe);
        System.out.println("\n| LIGHT");
        remote.buttonPressed(1);
        remote.buttonPressed(1);
        remote.buttonPressed(2);
        remote.buttonPressed(2);

        System.out.println("\n| FAN");
        Fan fan = new Fan();
        Commands fanOnHobe = new FanOn(fan);
        Commands fanOffHobe = new FanOff(fan);
        remote.setCommand(2, fanOnHobe, fanOffHobe);
        remote.buttonPressed(3);
        remote.buttonPressed(3);
        remote.buttonPressed(4);
        remote.buttonPressed(4);

        System.out.println("\n| AirConditioner");
        AirConditioner airConditioner = new AirConditioner();
        Commands acOnHobe = new ACOn(airConditioner);
        Commands acOffHobe = new ACOff(airConditioner);
        remote.setCommand(2, acOnHobe, acOffHobe);
        remote.buttonPressed(3);
        remote.buttonPressed(3);
        remote.buttonPressed(4);
        remote.buttonPressed(4);

        System.out.println("\n| Projector");
        Projector projector = new Projector();
        Commands projectorOnHobe = new ProjectorOn(projector);
        Commands projectorOffHobe = new ProjectorOff(projector);
        remote.setCommand(3, projectorOnHobe, projectorOffHobe);
        remote.buttonPressed(5);
        remote.buttonPressed(5);
        remote.buttonPressed(6);
        remote.buttonPressed(6);

        System.out.println("\n| Master Button Press");
        remote.buttonPressed(0);

        System.out.println("\n| Master Button Press");
        remote.buttonPressed(1);
        remote.buttonPressed(2);
        remote.buttonPressed(0);

        System.out.println("\n| Master Button Press");
        remote.buttonPressed(0);

        System.out.println("\n| Master Button Press");
        remote.buttonPressed(0);

    }
}