
class Light {
    boolean state;

    void on() {
        if (state == false) {
            System.out.println("Light turned On!");
            state = true;
            // System.out.println(state);
        } else {
            System.out.println("Light is already On !");
        }

    }

    void off() {
        if (state == true) {
            System.out.println("Light turned Off!");
            state = false;
            // System.out.println(state);
        } else {
            System.out.println("Light is already Off !");
        }

    }
}