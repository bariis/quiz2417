package Q1.SourceCode;

public class GTICar extends Polo {
    private int price;

    public GTICar() {
        this.price = 28000;
    }

    @Override
    public void createPoloCar() {
        System.out.println("GTI Car: " + this.price);
    }
}
