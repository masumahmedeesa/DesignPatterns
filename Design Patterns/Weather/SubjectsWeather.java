public interface SubjectsWeather {
    public void addObserver(Observers ob);
    public void removeObserver(Observers ob);
    public void notifyObserver();
}
