package pattern.abfactory;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url){
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
