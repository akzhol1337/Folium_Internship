package cloud.folium.aggregationVsComposition;

import java.util.ArrayList;

public class Building {
    Address address;
    ArrayList<Citizen> citizens;

    Building(ArrayList<Citizen> citizens){
        this.citizens = citizens;
        address = new Address();
    }
}
