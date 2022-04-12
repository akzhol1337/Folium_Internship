package cloud.folium.patterns.structural.Facade;

public class Developer {
    private boolean vacation;

    Developer(boolean vacation) {
        this.vacation = vacation;
    }

    public boolean isVacation() {
        return vacation;
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }

    public void work() {
        System.out.println("Writing code...");
    }
}
