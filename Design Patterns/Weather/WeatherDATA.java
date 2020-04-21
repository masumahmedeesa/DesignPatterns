import java.util.ArrayList;
import java.util.Random;

public class WeatherDATA implements SubjectsWeather {
    ArrayList<Observers>observers_list = new ArrayList<>();

    public void addObserver(Observers ob){
        observers_list.add(ob);
    }

    public void removeObserver(Observers ob){
        int foundFlag=-1;
        for(int i=0;i<observers_list.size();i++){
            if(ob.equals(observers_list.get(i))){
                foundFlag=1;
                break;
            }
        }
        if(foundFlag!=-1){
            observers_list.remove(ob);
        }
    }
    public void notifyObserver(){

//        for(int i=0;i<observers_list.size();i++){
//            Observers ob;
//            ob.updatedData(this);
//        }
        for(Observers ob: observers_list){
            ob.updatedData(this);
        }
    }

    public void measuresChange(){
        notifyObserver();
    }
    public int getTemperature() {
        Random rand = new Random();
        int rndom = rand.nextInt(900);
        return rndom;
    }

    public int getHumidity() {
        Random rand = new Random();
        int rndom = rand.nextInt(100);
        return rndom;
    }
    public int getPressure() {
        Random rand = new Random();
        int rndom = rand.nextInt(1000);
        return rndom;
    }
}
