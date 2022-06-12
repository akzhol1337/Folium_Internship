package cloud.folium.patterns.behavioral.Visitor;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("junior: ");
        project.beWritten(junior);

        System.out.println("senior: ");
        project.beWritten(senior);
    }
}
