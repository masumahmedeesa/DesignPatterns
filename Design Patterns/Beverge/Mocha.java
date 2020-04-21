class Mocha extends Condimants{
    
    Mocha(Beverage bvr){
        this.bvr = bvr;
        desp = bvr.getDesp()+" + One Mocha";
        // System.out.println(desp);
    }
    int cost(){
        return bvr.cost()+15;
    }
}