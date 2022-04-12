package cloud.folium.aggregationVsSegregation;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        Citizen akzhol = new Citizen();
        Citizen take = new Citizen();
        Citizen sanjik = new Citizen();

        ArrayList<Citizen> citizens = new ArrayList<>();
        citizens.add(akzhol);
        citizens.add(take);
        citizens.add(sanjik);

        Building building = new Building(citizens);
    }
}