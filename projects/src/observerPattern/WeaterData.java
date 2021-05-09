package observerPattern;

import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.List;

public class WeaterData implements Subject{

    private List<Observer> observers = new ArrayList<>();

    private float humidity;
    private float temperature;
    private float presure;

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }

    public void updateData(float presure,float humidity,float temperature){
        this.humidity = humidity;
        this.presure = presure;
        this.temperature = temperature;
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPresure() {
        return presure;
    }
}
