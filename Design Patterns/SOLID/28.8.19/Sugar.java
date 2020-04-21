class Sugar extends Condiments{
    Sugar(Beverage bvr){
        this.bvr = bvr;
        desp = bvr.getDesp() + ", Sugar";
    }
    int cost(){
        return bvr.cost()+5;
    }
}