package cloud.folium.patterns.behavioral.State;

public class TiredState implements State {
    public void doSomething() {
        System.out.println("Low energy! Need to relax");
    }
}
