package Visitor;

/**
 * Created by navid on 12/16/17.
 */
public interface Visitor {

    void visit(ConcreteElementOne ce1);
    void visit(ConcreteElementTwo ce2);
    void visit(ConcreteElementThree ce3);
}
