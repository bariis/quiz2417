package Q1.SourceCode;

public class FrontSeatDecorator extends PoloDecorator {

    public FrontSeatDecorator(Polo p) {
        super(p);
    }
    @Override
    public void createPoloCar() {
        super.createPoloCar();

        addHeatedFrontSeat();
    }

    @Override
    public MementoDecorator saveMemento(int stateId) {
        System.out.println(" Saving originator's current state id. ");
        return new MementoDecorator(stateId);
    }

    @Override
    public void restoreMemento(MementoDecorator previousMementoDecorator) {
        System.out.println(" Restoring to state id..." + previousMementoDecorator.getStateId());
        this.stateId = previousMementoDecorator.getStateId();
        System.out.println(" Current state id of originator : "+ stateId);
    }


    private void addHeatedFrontSeat() {
        System.out.println("Heated front-seat is added with extra 1200 GBP.");
    }
}
