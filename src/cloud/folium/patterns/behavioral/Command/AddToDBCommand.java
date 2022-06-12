package cloud.folium.patterns.behavioral.Command;

import java.util.List;

public class AddToDBCommand implements Command {
    private Data data;

    AddToDBCommand(Data data) {
        this.data = data;
    }

    public List<Data> execute(List<Data> DBvalues) {
        DBvalues.add(data);
        return DBvalues;
    }

    public List<Data> undo(List<Data> DBvalues) {
        DBvalues.remove(data);
        return DBvalues;
    }
}
