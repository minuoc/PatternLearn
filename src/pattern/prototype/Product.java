package pattern.prototype;

public interface Product extends Cloneable {
    public  void use(String s);
    public  Product createClone();
}
