package cloud.folium.patterns.behavioral.State;

public class Main {
    public static void main(String[] args) {
        State freshState = new FreshState();
        Developer akzhol = new Developer();

        akzhol.setState(freshState);

        akzhol.doSomething();

        akzhol.doSomething();

        akzhol.doSomething();

        akzhol.doSomething();
    }
}
