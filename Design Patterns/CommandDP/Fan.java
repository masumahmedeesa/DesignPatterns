
class Fan {
    boolean state;

    void on() {
        if (state == false) {
            System.out.println("Fan turned On!");
            state = true;
        } else {
            System.out.println("Fan is already On !");
        }

    }

    void off() {
        if (state == true) {
            System.out.println("Fan turned Off !");
            state = false;
        } else {
            System.out.println("Fan is already off!");
        }

    }
}