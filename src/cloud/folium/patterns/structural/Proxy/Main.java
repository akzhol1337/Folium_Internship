package cloud.folium.patterns.structural.Proxy;

public class Main {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.link.com");
        //project.run();

        Project project1 = new ProxyProject("https://www.link.com");
        project1.run();
    }
}
