package cloud.folium.patterns.creational.factoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dbType = in.nextInt();

        DatabaseFactory databaseFactory = new DatabaseFactory();

        Database db = databaseFactory.createDatabase(dbType);

        Connection conn = db.getConnection();

        System.out.println(conn.getName());

    }
}
