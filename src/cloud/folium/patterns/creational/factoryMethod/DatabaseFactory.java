package cloud.folium.patterns.creational.factoryMethod;

public class DatabaseFactory {
    public Database createDatabase(int dbType){
        if(dbType == 1){
            return new PostgreDB();
        } else if(dbType == 2){
            return new MySqlDB();
        } else if(dbType == 3){
            return new MongoDB();
        }
        return null;
    }
}
