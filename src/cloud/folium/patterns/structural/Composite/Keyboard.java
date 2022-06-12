package cloud.folium.patterns.structural.Composite;

public class Keyboard implements Entity {
    private String name;
    private double balance;

    Keyboard(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void showEntityDetails() {
        System.out.println(name + ": " + balance);
    }
}
