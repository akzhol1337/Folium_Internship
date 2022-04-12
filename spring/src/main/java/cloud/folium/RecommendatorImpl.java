package cloud.folium;

@Singleton
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("drink")
    private String drink;

    public RecommendatorImpl() {
        System.out.println("recommendator was created");
    }

    @Override
    public void recommend() {
        System.out.println("Recommended drink: "+drink);
    }
}
