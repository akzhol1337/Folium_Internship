package cloud.folium.patterns.structural.Adapter;

public class Main {
    public static void main(String[] args) {
        Account account = new AccountImplAdapter(new AccountImpl());
        System.out.println(account.parseData());
    }
}
