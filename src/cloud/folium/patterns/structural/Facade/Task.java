package cloud.folium.patterns.structural.Facade;

public class Task {
    private boolean started;

    Task(boolean started) {
        this.started = started;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
}
