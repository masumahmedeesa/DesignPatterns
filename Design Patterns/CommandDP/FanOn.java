class FanOn implements Commands{
    Fan fan;
    FanOn(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        // if(!light.state){
        //     light.off();
        // }
        // else{
        //     light.on();
        // }
        fan.on();
    }
}