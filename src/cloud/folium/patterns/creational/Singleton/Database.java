package cloud.folium.patterns.creational.Singleton;

public class Database {

    private static Connection conn = null;

    // ensure that no other class can instantiate a new instance
    private Database(){

    }

    // if conn is set already, that means we created a connection before, otherwise create a new connection
    public static Connection getInstance(){
        if(conn == null){
            conn = new Connection();
        }
        return conn;
    }

}
