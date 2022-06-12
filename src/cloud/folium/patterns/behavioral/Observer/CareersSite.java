package cloud.folium.patterns.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class CareersSite implements Observed {
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        subscribers.remove(observer);

    }

    public void notifyObservers() {
        for(Observer observer : subscribers) {
            observer.handleEvent(vacancies);
        }
    }
}