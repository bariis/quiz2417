package Q1.SourceCode;

public class MetallicColorDecorator extends PoloDecorator {
    public MetallicColorDecorator(Polo p) {
        super(p);
    }

    @Override
    public void createPoloCar() {
        super.createPoloCar();

        addMetallicColor();
    }

    @Override
    public MementoDecorator saveMemento(int stateId) {
        return new MementoDecorator(stateId);
    }

    @Override
    public void restoreMemento(MementoDecorator previousMementoDecorator) {
        this.stateId = previousMementoDecorator.getStateId();
    }

//    @Override
//    public MementoDecorator saveMemento(PoloDecorator decorator) {
//        return new MementoDecorator(decorator);
//    }
//
//    @Override
//    public void restoreMemento(MementoDecorator previousMementoDecorator) {
//        System.out.println("restoring to decorator");
////        System.out.println(" Restoring to state id..."+previousMemento.getStateId());
////        this.stateId = previousMemento.getStateId();
////        System.out.println(" Current state id of originator : "+ stateId);
//    }


    private void addMetallicColor() {
        System.out.println("Metallic color is added with extra 520 GBP.");
    }
}




//    public Memento saveMemento(int stateId) {
//        System.out.println(" Saving originator's current state id. ");
////Create memento with the current state and return it.
//        return new Memento(stateId);
//    }
//    //Restoring to a previous state from a(memento) object.
//    public void revertMemento(Memento previousMemento) {
//        System.out.println(" Restoring to state id..."+previousMemento.getStateId());
//        this.stateId = previousMemento.getStateId();
//        System.out.println(" Current state id of originator : "+ stateId);
//    }