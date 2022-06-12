package cloud.folium.patterns.behavioral.ChainOfResponsibility;

public class WarningNotifier extends Notifier {

    WarningNotifier(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Warning: " + message);
    }
}
