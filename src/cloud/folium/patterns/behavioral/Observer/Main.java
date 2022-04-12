package cloud.folium.patterns.behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        CareersSite carrersSite = new CareersSite();

        Observer subscriberOne = new Subscriber("Talgat");
        Observer subsriberTwo = new Subscriber("Sanjik");

        carrersSite.addObserver(subscriberOne);
        carrersSite.addObserver(subsriberTwo);

        carrersSite.addVacancy("Java/Kotlin developer");


        carrersSite.addVacancy("Python developer");

    }
}
