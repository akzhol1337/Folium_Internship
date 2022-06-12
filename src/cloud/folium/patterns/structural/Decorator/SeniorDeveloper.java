package cloud.folium.patterns.structural.Decorator;

public class SeniorDeveloper extends DeveloperDecorator {
    SeniorDeveloper(Developer developer){
        super(developer);
    }

    public void executeJob() {
        developer.executeJob();
        System.out.println("code review... ");
    }
}

