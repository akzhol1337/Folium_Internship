package cloud.folium.patterns.behavioral.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println();

        newsPage.showPage();
    }
}
