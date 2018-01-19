package Visitor;

/**
 * Created by navid on 12/16/17.
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElementOne ce1) {
        System.out.println("Concrete Element One");
        System.out.println(ce1.describeMe());
        System.out.println("this is property one:"+ce1.getProp1());
        System.out.println(" --------------- ");
    }


    @Override
    public void visit(ConcreteElementTwo ce2) {
        System.out.println("Concrete Element 2");
        System.out.println(ce2.describeMe());
        System.out.println(ce2.getFirstProperty());
        System.out.println(ce2.getSecondProperty());
        System.out.println(ce2.getSecondProperty() + ce2.getFirstProperty());
        System.out.println(" --------------- ");
    }

    @Override
    public void visit(ConcreteElementThree ce3) {
        System.out.println("Concrete Element 3");
        System.out.println(ce3.description());
        System.out.println(" --------------- ");

    }
}
