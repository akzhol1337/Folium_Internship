package cloud.folium.patterns.structural.Composite;

public class Main {
    public static void main(String[] args) {
        Entity CPU = new CPU("Intel", 130000);
        Entity GPU = new GPU("Nvidia", 200000);

        Entity monitor = new Monitor("Benq", 250000);
        Entity keyboard = new Keyboard("HyperX", 50000);
        Entity mouse = new Mouse("zowie", 60000);

        SystemUnit systemUnit = new SystemUnit();
        systemUnit.addEntity(CPU);
        systemUnit.addEntity(GPU);

        PC pc = new PC();
        pc.addEntity(monitor);
        pc.addEntity(keyboard);
        pc.addEntity(mouse);
        pc.addEntity(systemUnit);

        pc.showEntityDetails();

    }
}
