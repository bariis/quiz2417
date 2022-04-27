package Q1.SourceCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Polo car without extension");
        Polo gtiCar = new GTICar();
        gtiCar.createPoloCar();

        System.out.println("Polo car with a front-seat extension");
        PoloDecorator frontSeatDecorator = new FrontSeatDecorator(gtiCar);
        frontSeatDecorator.createPoloCar();

        System.out.println("------------------------------------");

        System.out.println("Life car without extension");
        Polo lifeCar = new LifeCar();
        lifeCar.createPoloCar();
        System.out.println("Life car with metallic color and alloy rims extensions");
        PoloDecorator lifeWithRimAndMetallic = new AlloyRimDecorator(new MetallicColorDecorator(lifeCar));
        lifeWithRimAndMetallic.createPoloCar();

        System.out.println("------------------------------------\n\n");
        System.out.println("MEMENTO PART");
        System.out.println("Style car without an extension");
        Polo styleCar = new StyleCar();
        styleCar.createPoloCar();
        PoloDecorator alloy = new AlloyRimDecorator(styleCar);
        MementoDecorator memento;
        alloy.setStateId(1);
        memento = alloy.saveMemento(alloy.getStateId());

        // PoloDecorator frontSeat = new FrontSeatDecorator();
        alloy = new FrontSeatDecorator(alloy);
        alloy.setStateId(2);
        memento = alloy.saveMemento(alloy.getStateId());

        alloy = new MetallicColorDecorator(alloy);
        alloy.setStateId(3);

        alloy.createPoloCar();
        System.out.println("restore");
        alloy.restoreMemento(memento);




//        System.out.println("Style car with a alloy rims decorator");
//        AlloyRimDecorator alloyRimDecorator = new AlloyRimDecorator(styleCar);
//        alloyRimDecorator.createPoloCar();
    }
}


// originator -> polo car