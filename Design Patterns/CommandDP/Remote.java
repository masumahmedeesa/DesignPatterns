// import java.util.List;
// import java.util.ArrayList;

class Remote {
    Commands[] slot = new Commands[7];
    // int number;

    // private List<Commands> commandList = new ArrayList<Commands>();

    void setCommand(int index, Commands cmd) {
        // commandList.add(cmd);
        // slot = cmd;
        slot[index] = cmd;
    }

    void setCommand(int pair_no, Commands cmdOn, Commands cmdOff){
        int first  = 2*pair_no - 1;
        int second = first+1;
        slot[first] = cmdOn;
        slot[second] = cmdOff;
    }

    void buttonPressed(int index) {
        // for (Commands slot : commandList)
        if (index == 0) {
            masterButtonPressed();
        }
        else slot[index].execute();

    }

    int master_state = 0;

    void masterButtonPressed() {
        master_state^=1;
        // if(master_state == 1){
        //     master_state = 2;
        //     // master_state++;
        // }
        // else if(master_state == 2){
        //     master_state = 1;
        // }
        for(int i=master_state; i<slot.length;i+=2){
            if(! (slot[i]==null))
                slot[i].execute();
        }
        // System.out.println(master_state);
    }
}