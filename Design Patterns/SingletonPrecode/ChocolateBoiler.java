import java.util.Random;

class ChocolateBoiler {
    private boolean empty, boiled;

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    private int signature;

    private ChocolateBoiler() {
        System.out.println("Creating Object");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        empty = true;
        boiled = false;

        Random rand = new Random();
        signature = rand.nextInt(1000000000);
        System.out.println("Created: " + this);
    }

    private static ChocolateBoiler uniqObj;

    public static ChocolateBoiler getUniqueInstance() {
        if (uniqObj == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqObj == null) {
                    System.out.println("Craeting From Block");
                    uniqObj = new ChocolateBoiler();
                }
            }
        }
        return uniqObj;
    }

    public String toString() {
        return "Boiler<" + signature + ">";
    }

    public synchronized void fill() {
        if (isEmpty()) {
            System.out.println(this + "Filling chocolate and milk");
            empty = false;
            boiled = false;
        } else {
            System.out.println(this + "Can't fill: Boiler not empty");
        }
    }

    public synchronized void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println(this + "0o.o0 boiling chocolate and milk");
            boiled = true;
        } else {
            if (isEmpty())
                System.out.println(this + "Can't boil: Boiler is empty");
            else
                System.out.println(this + "Can't boil: Already boiled");
        }
    }

    public synchronized void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println(this + "Draining chocolate bars");
            empty = true;
        } else {
            if (isEmpty())
                System.out.println(this + "Can't drain: Boiler is empty");
            else
                System.out.println(this + "Can't drain: Not boiled yet");
        }
    }
}