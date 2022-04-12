package cloud.folium.patterns.behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Notifier warningNotifier = new WarningNotifier(Priority.LOW);
        Notifier kickNotifier = new KickNotifier(Priority.MEDIUM);
        Notifier banNotifier = new BanNotifier(Priority.HIGH);

        warningNotifier.setNextNotifier(kickNotifier);

        kickNotifier.setNextNotifier(banNotifier);

        warningNotifier.notifyManager("msg1", Priority.LOW);
        warningNotifier.notifyManager("msg2", Priority.MEDIUM);
        warningNotifier.notifyManager("msg3", Priority.HIGH);
    }
}
