package TwoWayAdapter2;

/**
 * Created by navid on 1/24/18.
 */
public class ConcreteB implements InterfaceB {
    @Override
    public String doOne() {
        return "ConcreteB: do One...";
    }

    @Override
    public String doTwo() {
        return "ConcreteB: do Two...";
    }
}
