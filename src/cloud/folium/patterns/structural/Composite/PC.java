package cloud.folium.patterns.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class PC implements Entity {
    private List<Entity> entities = new ArrayList<>();

    public void showEntityDetails() {
        for(Entity entity : entities) {
            entity.showEntityDetails();
        }
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public void removeEntity(Entity entity) {
        entities.remove(entity);
    }
}
