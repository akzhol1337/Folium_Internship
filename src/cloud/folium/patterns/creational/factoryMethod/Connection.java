package cloud.folium.patterns.creational.factoryMethod;

public class Connection {
    private String name;
    Connection(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
