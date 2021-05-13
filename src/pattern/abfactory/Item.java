package pattern.abfactory;

public abstract class Item {
    protected String caption;
    public abstract String makeHTML();

    public Item(String caption) {
        this.caption = caption;
    }
}
