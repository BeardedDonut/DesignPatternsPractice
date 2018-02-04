package Bridge.accelerator;

/**
 * Created by navid on 2/3/18.
 */
public class Propeller implements AccelerationMechanism {
    @Override
    public void accelerate() {
        System.out.println("PROPELLER: ... <propeller spinning> ...");
    }
}
