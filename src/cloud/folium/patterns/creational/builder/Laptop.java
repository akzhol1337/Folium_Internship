package cloud.folium.patterns.creational.builder;

public class Laptop {
    private String name;
    private Double diagonal;
    private String OS;
    private Integer price;

    Laptop(String name){
        this.name = name;
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

    public void setPrice(Integer price) {
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

    public Integer getPrice() {
        return this.price;
    }

    public String toString(){
        return name + " " + diagonal + " " + OS + " " + price;
    }
}
