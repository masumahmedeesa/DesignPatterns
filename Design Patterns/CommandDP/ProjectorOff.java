class ProjectorOff implements Commands{
    Projector projector;
    ProjectorOff(Projector projector){
        this.projector = projector;
    }
    @Override
    public void execute() {
        projector.off();
    }
}