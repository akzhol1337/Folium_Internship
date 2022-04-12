package cloud.folium.patterns.structural.Facade;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProjectFacade searchEngineFacade = new ProjectFacade(List.of(new Developer(false), new Developer(false), new Developer(true)), new Task(false));
        System.out.println(searchEngineFacade.startProject());

        ProjectFacade serverOptimizationFacade = new ProjectFacade(List.of(new Developer(false),new Developer(false), new Developer(false), new Developer(false)), new Task(false));
        System.out.println(serverOptimizationFacade.startProject());

    }
}
