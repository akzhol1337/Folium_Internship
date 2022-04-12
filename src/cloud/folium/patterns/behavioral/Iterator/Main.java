package cloud.folium.patterns.behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] techStack = {"Java", "Kotlin", "Spring", "Ktor", "PostgreSQL", "MongoDB"};

        Developer developer = new Developer("Akzhol", techStack);

        Iterator iterator = developer.getIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
