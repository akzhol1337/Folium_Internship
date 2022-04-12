package cloud.folium.patterns.structural.Decorator;

public class DeveloperDecorator implements Developer {
    Developer developer;

    DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    public void executeJob() {
        developer.executeJob();
    }
}
