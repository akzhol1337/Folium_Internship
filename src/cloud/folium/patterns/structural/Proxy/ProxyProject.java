package cloud.folium.patterns.structural.Proxy;

public class ProxyProject implements Project {
    private String url;
    private RealProject realProject;

    ProxyProject(String url){
        this.url = url;
    }

    public void run() {
        if(realProject == null){
            realProject = new RealProject(url);
        }
        realProject.run();
    }

}

