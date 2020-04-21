import java.util.*;

public class Outputer {
    Outputable obj;

    public Outputer(Outputable obj) {
        this.obj = obj;
    }

    public void setObj(Outputable obj) {
        this.obj = obj;
    }
    
    void showJSON(){
        ArrayList<Variable> info = new ArrayList();
        info = obj.getInfo();
        int size = info.size();
        for(Variable var : info){
            System.out.println(var.value);
        }
    }
}
