class Sugar extends Condimants{

    Sugar(Beverage bvr){
        this.bvr = bvr;
        desp = bvr.getDesp()+" + One Sugar";
        // System.out.println(desp);
    }
    
    int cost(){
        return bvr.cost()+10;
    }
}