class Mocha extends Condiments{
    Mocha(Beverage bvr){
        this.bvr = bvr;
        desp = bvr.getDesp() + ", Mocha";
    }
    int cost(){
        return bvr.cost()+15;
    }
}