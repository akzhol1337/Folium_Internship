package cloud.folium.patterns.behavioral.Visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;
    Project() {
        this.projectElements = new ProjectElement[] {
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }
    public void beWritten(Developer developer) {
        for(ProjectElement element : projectElements) {
            element.beWritten(developer);
        }
    }
}
