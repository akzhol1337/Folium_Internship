package cloud.folium.patterns.creational.Prototype;

public class Laptop implements Prototypeable{
    private String name;
    private Double diagonal;
    private String OS;
    private int price;

    Laptop(String name, Double diagonal, String OS, int price){
        this.name = name;
        this.diagonal = diagonal;
        this.OS = OS;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiagonal(Double Diagonal) {
        this.diagonal = Diagonal;
    }

    public void setOS(String OS) {
        this.OS = OS;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getlaptopName() {
        return this.name;
    }

    public Double getDiagonal() {
        return this.diagonal;
    }

    public String getOS() {
        return this.OS;
    }

    public int getPrice() {
        return this.price;
    }

    public Prototypeable createClone() {
        return new Laptop(name, diagonal, OS, price);
    }

    public String toString(){
        return name + " " + diagonal + " " + OS + " " + price;
    }
}