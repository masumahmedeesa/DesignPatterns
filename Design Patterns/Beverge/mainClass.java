public class mainClass{

    public static void main(String args[]){
        Beverage bvr = new DarkRoast();
        bvr = new Mocha(bvr);
        bvr = new Mocha(bvr);
        bvr = new Sugar(bvr);
        System.out.println(bvr.getDesp());
        System.out.println("Cost: "+ bvr.cost() +"BDT\n");

        Beverage bvr2 = new Decaf();
        bvr2 = new Mocha(bvr2);
        bvr2 = new Sugar(bvr2);
        bvr2 = new Honey(bvr2);
        System.out.println(bvr2.getDesp());
        System.out.println("Cost: "+ bvr2.cost() +"BDT\n");
    }
}