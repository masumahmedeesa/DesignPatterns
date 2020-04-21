class ACOn implements Commands {
    AirConditioner fan;

    ACOn(AirConditioner fan) {
        this.fan =fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}