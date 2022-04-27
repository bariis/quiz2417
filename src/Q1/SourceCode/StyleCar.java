package Q1.SourceCode;

public class StyleCar extends Polo {
    private int price;

    public StyleCar() {
        this.price = 21000;
    }

    @Override
    public void createPoloCar() {
        System.out.println("Style: " + this.price);
    }
}
