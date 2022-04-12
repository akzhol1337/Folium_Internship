package cloud.folium.patterns.creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Macbook Pro", 14.0, "Mac Os", 1000000);
        System.out.println(laptop.toString());

        Laptop clone1 = (Laptop) laptop.createClone();
        Laptop clone2 = (Laptop) laptop.createClone();

        clone1.setName("new Name");

        System.out.println(laptop.toString());
        System.out.println(clone1.toString());
        System.out.println(clone2.toString());
    }
}
