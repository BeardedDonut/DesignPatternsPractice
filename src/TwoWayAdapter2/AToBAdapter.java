package TwoWayAdapter2;

/**
 * Created by navid on 1/24/18.
 */
public class AToBAdapter implements InterfaceA, InterfaceB {
    ConcreteA conAInstance;
    ConcreteB conBInstance;

    public AToBAdapter(ConcreteA conAInstance, ConcreteB conBInstance) {
        this.conAInstance = conAInstance;
        this.conBInstance = conBInstance;
    }

    // A interface -> do1()
    @Override
    public String do1() {
        return conBInstance.doOne();
    }

    // A interface -> do1()
    @Override
    public String do2() {
        return  conBInstance.doTwo();
    }


    // B interface -> doOne()
    @Override
    public String doOne() {
        return conAInstance.do1();
    }

    // B interface -> doTwo()
    @Override
    public String doTwo() {
        return conAInstance.do2();
    }
}
