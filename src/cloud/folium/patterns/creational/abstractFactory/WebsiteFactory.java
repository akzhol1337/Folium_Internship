package cloud.folium.patterns.creational.abstractFactory;

public class WebsiteFactory implements ProjectTeamFactory{
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManager getProjectManager() {
        return new PM();
    }
}

