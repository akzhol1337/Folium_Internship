package cloud.folium.patterns.structural.Composite;

public class Monitor implements Entity {
    private String name;
    private double balance;

    Monitor(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void showEntityDetails() {
        System.out.println(name + ": " + balance);
    }
}
