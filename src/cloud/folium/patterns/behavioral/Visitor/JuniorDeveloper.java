package cloud.folium.patterns.behavioral.Visitor;

public class JuniorDeveloper implements Developer {
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    public void create(Database database) {
        System.out.println("Drop database...");
    }

    public void create(Test test) {
        System.out.println("Creating not reliable test");
    }
}
