package cloud.folium.patterns.behavioral.Visitor;

public class ProjectClass implements ProjectElement {
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
