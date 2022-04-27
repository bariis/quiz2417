package Q1.SourceCode;

public abstract class PoloDecorator extends Polo {
    protected Polo polo;
    int stateId;
    public PoloDecorator(Polo polo) {
        this.polo = polo;
    }

    @Override
    public void createPoloCar() {
        if(this.polo != null) {
            this.polo.createPoloCar();
        }
    }

    public void setStateId(int stateId) {
        System.out.println(" Setting the state id of the originator to : "+ stateId);
        this.stateId = stateId;
    }

    public int getStateId() {
        return this.stateId;
    }

    public abstract MementoDecorator saveMemento(int stateId);
    public abstract void restoreMemento(MementoDecorator previousMementoDecorator);
}
