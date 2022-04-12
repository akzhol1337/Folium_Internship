package cloud.folium.patterns.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloper(String type) {
        Developer developer = developers.get(type);

        if(developer == null) {
            if(type == "java") {
                System.out.println("Hiring java developer...");
                developer = new JavaDeveloper();
            } else if(type == "cpp") {
                System.out.println("Hiring cpp developer");
                developer = new CppDeveloper();
            }
        }
        developers.put(type, developer);
        return developer;
    }
}
