class LightOn implements Commands{
    Light light;
    LightOn(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}