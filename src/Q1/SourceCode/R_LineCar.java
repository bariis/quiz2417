package Q1.SourceCode;

public class R_LineCar extends Polo {
    private int price;

    public R_LineCar() {
        this.price = 25000;
    }
    @Override
    public void createPoloCar() {
        System.out.println("-Line Car: " + this.price);
    }
}
