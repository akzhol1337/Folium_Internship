package cloud.folium.patterns.structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloper("java"));
        developers.add(developerFactory.getDeveloper("java"));
        developers.add(developerFactory.getDeveloper("java"));
        developers.add(developerFactory.getDeveloper("java"));
        developers.add(developerFactory.getDeveloper("java"));


        developers.add(developerFactory.getDeveloper("cpp"));
        developers.add(developerFactory.getDeveloper("cpp"));
        developers.add(developerFactory.getDeveloper("cpp"));
        developers.add(developerFactory.getDeveloper("cpp"));
        developers.add(developerFactory.getDeveloper("cpp"));


    }
}
