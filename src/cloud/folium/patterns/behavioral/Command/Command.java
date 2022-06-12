package cloud.folium.patterns.behavioral.Command;

import java.util.List;

public interface Command {
    List<Data> execute(List<Data> DBvalues);
    List<Data> undo(List<Data> DBvalues);
}

