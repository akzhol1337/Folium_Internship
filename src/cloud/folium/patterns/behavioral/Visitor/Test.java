package cloud.folium.patterns.behavioral.Visitor;

public class Test implements ProjectElement {
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
