class Honey extends Condimants{

    Honey(Beverage bvr){
        this.bvr = bvr;
        desp = bvr.getDesp()+" + One Honey";
        // System.out.println(desp);
    }
    
    int cost(){
        return bvr.cost()+5;
    }
}