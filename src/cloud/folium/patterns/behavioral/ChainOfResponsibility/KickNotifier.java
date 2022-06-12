package cloud.folium.patterns.behavioral.ChainOfResponsibility;

public class KickNotifier extends Notifier {
    public KickNotifier(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Kick: " + message);
    }
}
