package cloud.folium.patterns.structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Developer developer = new TeamLead(new SeniorDeveloper(new JuniorDeveloper()));
        developer.executeJob();
    }
}
