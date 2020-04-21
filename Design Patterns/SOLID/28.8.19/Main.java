class Main{
    public static void main(String[] args) {
        Beverage bvr = new DarkRoast();
        bvr = new Mocha(bvr);
        bvr = new Mocha(bvr);
        bvr = new Sugar(bvr);
        System.out.println("Desc: "+bvr.desp+"\nCost = " + bvr.cost()+"\n\n");

        Beverage bvr2 = new Expresso();
        bvr2 = new Mocha(bvr2);
        bvr2 = new Sugar(bvr2);
        bvr2 = new Sugar(bvr2);
        System.out.println("Desc: "+bvr2.desp+"\nCost = " + bvr2.cost());
    }
}