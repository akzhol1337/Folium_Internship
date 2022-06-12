package cloud.folium.patterns.behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        Person akzhol = new Person();

        akzhol.setActivity(new Eat());
        akzhol.executeJob();

        akzhol.setActivity(new Sleep());
        akzhol.executeJob();

        akzhol.setActivity(new Code());
        akzhol.executeJob();

        akzhol.setActivity(new Repeat());
        akzhol.executeJob();
    }
}
