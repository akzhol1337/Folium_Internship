package cloud.folium.patterns.behavioral.Visitor;

public class Database implements ProjectElement {
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
