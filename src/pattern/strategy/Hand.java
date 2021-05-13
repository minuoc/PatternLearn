package pattern.strategy;

public class Hand {
    private static final int HANDVALUE_GUU = 0; //表示石头的值
    private static final int HANDVALUE_CHO = 1; //表示剪刀的值
    private static final int HANDVALUE_PAA = 2; //表示布的值

    public static final Hand[] hand =  {
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_PAA)
    };

    private int handvalue;

    public Hand(int handvalue) {
        this.handvalue = handvalue;
    }
}
