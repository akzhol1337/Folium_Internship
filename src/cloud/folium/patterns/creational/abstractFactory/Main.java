package cloud.folium.patterns.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager PM = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        PM.manageProject();

    }
}
