package cloud.folium.patterns.behavioral.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DB {
    private List<Data> DBvalues = new ArrayList<>();
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        DBvalues = command.execute(DBvalues);
        history.push(command);
    }

    public void printData() {
        for(Data data : DBvalues) {
            System.out.print(data.getContent() + " ");
        }
        System.out.println();
    }

    public void undo() {
        Command lastCommand = history.pop();
        DBvalues = lastCommand.undo(DBvalues);
    }
}