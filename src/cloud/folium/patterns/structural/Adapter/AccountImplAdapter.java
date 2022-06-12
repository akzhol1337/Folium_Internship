package cloud.folium.patterns.structural.Adapter;

public class AccountImplAdapter implements Account{
    AccountImpl account;
    AccountImplAdapter(AccountImpl account){
        this.account = account;
    }
    public String parseData() {
        // converting unsuitable method to suitable to interface
        return account.parse();
    }
}
