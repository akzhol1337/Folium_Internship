package cloud.folium.patterns.behavioral.Command;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();

        db.executeCommand(new AddToDBCommand(new Data("Akzhol")));
        db.executeCommand(new AddToDBCommand(new Data("Is")));
        db.executeCommand(new AddToDBCommand(new Data("The")));

        Data bestData = new Data("Best");
        Command bestCommand = new AddToDBCommand(bestData);

        db.executeCommand(bestCommand);

        db.printData();

        db.undo();

        db.printData();

        db.executeCommand(bestCommand);

        db.printData();

        db.executeCommand(new RemoveFromDBCommand(bestData));

        db.printData();

    }
}
