public class CurrentCondition implements Observers {
    @Override
    public void updatedData(WeatherDATA obUpdated) {
        System.out.println("| CurrentCondition updatedData Called");
        System.out.println("Temperature:  " +obUpdated.getTemperature() + " Kelvin");
        System.out.println("Humidity:  " +obUpdated.getHumidity() + " %");
        System.out.println("Pressure:  " +obUpdated.getPressure() + " Atmosphere\n");
//        System.out.println();
    }
}
