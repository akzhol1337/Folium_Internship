package cloud.folium.patterns.creational.factoryMethod;

public class PostgreDB implements Database {
    public Connection getConnection() {
        return new Connection("Postgres");
    }
}
