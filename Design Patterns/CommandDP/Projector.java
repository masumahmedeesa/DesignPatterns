
class Projector {
    boolean state;

    void on() {
        if (state == false) {
            System.out.println("Projector turned On!");
            state = true;
            // System.out.println(state);
        } else {
            System.out.println("Projector is already On !");
        }

    }

    void off() {
        if (state == true) {
            System.out.println("Projector turned Off!");
            state = false;
            // System.out.println(state);
        } else {
            System.out.println("Projector is already Off !");
        }

    }
}