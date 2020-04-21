class ACOff implements Commands {
    AirConditioner fan;

    ACOff(AirConditioner fan) {
        this.fan =fan;
    }

    @Override
    public void execute() {
        fan.off();
    }
}