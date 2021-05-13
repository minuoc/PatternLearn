package pattern.adapter.useDelegate;


import pattern.adapter.Banner;

public class PrintBanner extends Print{

    //这里使用了委托
    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
