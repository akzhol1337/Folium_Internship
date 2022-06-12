package cloud.folium.patterns.behavioral.Observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;
    Subscriber(String name) {
        this.name = name;
    }

    public void handleEvent(List<String> vacancies) {
        System.out.println("#" + name + " UPD : " + vacancies);
    }
}
