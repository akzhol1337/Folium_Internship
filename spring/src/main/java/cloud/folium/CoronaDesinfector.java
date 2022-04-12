package cloud.folium;

public class CoronaDesinfector {
    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Starting desinfection");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Ending desinfection");
    }

    private void desinfect(Room room) {
        System.out.println("...desinfecting...");
    }
}
