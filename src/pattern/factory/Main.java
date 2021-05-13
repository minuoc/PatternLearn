package pattern.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小陈");
        Product card2 = factory.create("小赵");
        Product card3 = factory.create("小刚");

        card1.use();
        card2.use();
        card3.use();

    }
}
