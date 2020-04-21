class FanOff implements Commands{
    Fan fan;
    FanOff(Fan fan){
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
        fan.off();
    }
}