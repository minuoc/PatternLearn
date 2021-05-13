package pattern.abfactory;

import pattern.factory.IDCard;

public abstract class Link extends Item {
    public String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
