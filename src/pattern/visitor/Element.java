package pattern.visitor;

public interface Element {
    public abstract void accept(Vistor v);
}
