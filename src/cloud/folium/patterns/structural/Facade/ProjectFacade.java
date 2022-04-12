package cloud.folium.patterns.structural.Facade;

import java.util.List;

public class ProjectFacade {
    List<Developer> developers;
    Task task;

    ProjectFacade(List<Developer> developers, Task task) {
        this.developers = developers;
        this.task = task;
    }

    public boolean startProject() {
        if(task.isStarted()) {
            return false;
        }
        for(Developer developer : developers) {
            if(developer.isVacation()) {
                return false;
            }
        }
        return true;
    }
}

