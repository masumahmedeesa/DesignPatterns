
class AirConditioner {
    boolean state;

    void on() {
        if (state == false) {
            System.out.println("AirConditioner turned On!");
            state = true;
        } else {
            System.out.println("AirConditioner is already On !");
        }

    }

    void off() {
        if (state == true) {
            System.out.println("AirConditioner turned Off !");
            state = false;
        } else {
            System.out.println("AirConditioner is already off!");
        }

    }
}