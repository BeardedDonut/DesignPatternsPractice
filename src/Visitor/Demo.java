package Visitor;

/**
 * Created by navid on 12/16/17.
 */
public class Demo {
    public static void main(String... args) {

        // instantiating each concrete element
        ConcreteElementTwo  ce2 = new ConcreteElementTwo(12.5f, 54);
        ConcreteElementOne ce1 = new ConcreteElementOne(17,"Bruce Wayne?!");
        ConcreteElementThree ce3 = new ConcreteElementThree("John Doe");
        ConcreteElementOne ce1_1 = new ConcreteElementOne(5,"Tony Stark");

        // instantiating a Visitor
        ConcreteVisitor cv = new ConcreteVisitor();

        // each concrete element accepts the cv
        ce1.accept(cv);
        ce1_1.accept(cv);
        ce2.accept(cv);
        ce3.accept(cv);

        /* Note:    You can have multiple Different
                    Visitors which can Operate Differently
                    on Various Elements...
        */
    }
}
