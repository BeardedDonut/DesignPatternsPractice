package TwoWayAdapter2;

/**
 * Created by navid on 1/24/18.
 */
public class ConcreteA implements InterfaceA {
    @Override
    public String do1() {
        return "ConcreteA: Doing 1...";
    }

    @Override
    public String do2() {
        return "ConcreteA: Doing 2...";
    }
}
