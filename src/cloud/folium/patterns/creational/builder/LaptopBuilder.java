package cloud.folium.patterns.creational.builder;

public class LaptopBuilder {
    private Laptop laptop;
    LaptopBuilder(String name){
        laptop = new Laptop(name);
    }

    public LaptopBuilder setDiagonal(Double diagonal){
        laptop.setDiagonal(diagonal);
        return this;
    }

    public LaptopBuilder setOS(String OS){
        laptop.setOS(OS);
        return this;
    }

    public LaptopBuilder setPrice(Integer price){
        laptop.setPrice(price);
        return this;
    }

    public Laptop build(){
        return laptop;
    }
}