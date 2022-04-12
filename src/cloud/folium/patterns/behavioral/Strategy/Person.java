package cloud.folium.patterns.behavioral.Strategy;

public class Person {
    Activity activity;

    void setActivity(Activity activity) {
        this.activity = activity;
    }

    void executeJob(){
        activity.doJob();
    }
}

