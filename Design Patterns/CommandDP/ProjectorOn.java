class ProjectorOn implements Commands{
    Projector projector;
    ProjectorOn(Projector projector){
        this.projector = projector;
    }
    @Override
    public void execute() {
        projector.on();
    }
}