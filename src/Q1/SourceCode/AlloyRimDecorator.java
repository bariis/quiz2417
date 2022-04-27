package Q1.SourceCode;

public class AlloyRimDecorator extends PoloDecorator {
    public AlloyRimDecorator(Polo p) {
        super(p);
    }
    @Override
    public void createPoloCar() {
        super.createPoloCar();
        addAlloyRim();
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

//    @Override
//    public MementoDecorator createMemento() {
//        return null;
//    }
//
//    @Override
//    public void restore(MementoDecorator decorator) {
//
//    }

    private void addAlloyRim() {
        System.out.println("Alloy rim is added with extra 700 GBP.");
    }
}
