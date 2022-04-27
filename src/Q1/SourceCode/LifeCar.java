package Q1.SourceCode;

public class LifeCar extends Polo {
    private int price;

    public LifeCar() {
        this.price = 18000;
    }
    @Override
    public void createPoloCar() {
        System.out.println("Life Car: " + this.price);
    }
}
