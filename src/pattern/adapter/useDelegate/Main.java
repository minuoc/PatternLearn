package pattern.adapter.useDelegate;


import pattern.adapter.Banner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner(new Banner("hello"));
        p.printWeak();
        p.printStrong();
    }
}
