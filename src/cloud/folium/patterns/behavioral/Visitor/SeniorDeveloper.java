package cloud.folium.patterns.behavioral.Visitor;

public class SeniorDeveloper implements Developer {
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior...");
    }

    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    public void create(Test test) {
        System.out.println("Creating reliable tests");
    }
}
