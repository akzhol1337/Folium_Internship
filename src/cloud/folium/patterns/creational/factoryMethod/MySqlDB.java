package cloud.folium.patterns.creational.factoryMethod;

public class MySqlDB implements Database {
    public Connection getConnection() {
        return new Connection("MySql");
    }
}
