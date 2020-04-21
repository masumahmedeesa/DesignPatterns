class Main{
    public static void main(String[] args){
        // ChocolateBoiler boiler = ChocolateBoiler.getUniqueInstance();
        // ChocolateBoiler boiler2 = ChocolateBoiler.getUniqueInstance();
        // System.out.println(boiler);
        // System.out.println(boiler2);

        // boiler.boil(); // can't boil
        // boiler2.boil();

        // boiler2.fill();
        // boiler.fill();
        // boiler.fill(); // can't fill
        // // boiler2.fill();

        // boiler.drain(); // can't drain
        
        // boiler.boil();
        Thread t1 = new Thread(new SimpleThread("Thread One"));
        t1.start();
        try{
            Thread.sleep(1000);
        } catch(Exception e){}


        Thread t2 = new Thread(new SimpleThread("Thread Two"));
        t2.start();

    }
}