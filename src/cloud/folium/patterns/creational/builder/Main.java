package cloud.folium.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Laptop akzholsLaptop = new LaptopBuilder("Macbook Pro").build();
        System.out.println(akzholsLaptop.toString());

        Laptop talgatsLaptop = new LaptopBuilder("Lenovo").setDiagonal(13.0).setOS("Linux").setPrice(400000).build();
        System.out.println(talgatsLaptop.toString());

        Laptop SanzharsLaptop = new LaptopBuilder("Acer").setPrice(500000).build();
        System.out.println(SanzharsLaptop.toString());
    }
}
