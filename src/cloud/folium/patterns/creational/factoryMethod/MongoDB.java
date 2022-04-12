package cloud.folium.patterns.creational.factoryMethod;

public class MongoDB implements Database {
    public Connection getConnection() {
        return new Connection("MongoDB");
    }
}
