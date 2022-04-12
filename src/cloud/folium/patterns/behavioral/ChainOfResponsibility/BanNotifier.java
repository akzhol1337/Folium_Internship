package cloud.folium.patterns.behavioral.ChainOfResponsibility;

public class BanNotifier extends Notifier {
    public BanNotifier(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Ban: " + message);
    }
}
