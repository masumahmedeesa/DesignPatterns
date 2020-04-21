public class MainClass {
    public static void main(String args[]){
        WeatherDATA weatherDATA = new WeatherDATA();
        System.out.println("Welcome to WEATHER-INFO\n");

        Observers currentCondition = new CurrentCondition();
        Observers statistics = new Statistics();
        Observers foreCast = new ForeCast();

        weatherDATA.addObserver(currentCondition);
        weatherDATA.addObserver(statistics);
        weatherDATA.addObserver(foreCast);

        weatherDATA.measuresChange();

        weatherDATA.removeObserver(foreCast);
        System.out.println("After Removal of ForeCast: \n");
        weatherDATA.measuresChange();
    }
}
