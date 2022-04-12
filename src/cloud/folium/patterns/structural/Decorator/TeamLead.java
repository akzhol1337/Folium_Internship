package cloud.folium.patterns.structural.Decorator;

public class TeamLead extends DeveloperDecorator {
    TeamLead(Developer developer) {
        super(developer);
    }

    public void executeJob() {
        developer.executeJob();
        System.out.println("Send report... ");
    }
}
