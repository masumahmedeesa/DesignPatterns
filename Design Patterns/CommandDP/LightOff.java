class LightOff implements Commands{
    Light light;
    LightOff(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}