package cloud.folium.patterns.structural.Proxy;

public class RealProject implements Project {
    private String url;

    RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project...");
    }

    public void run() {
        System.out.println("Running project...");
    }
}

