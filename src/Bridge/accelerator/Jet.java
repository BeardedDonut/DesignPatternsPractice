package Bridge.accelerator;

/**
 * Created by navid on 2/3/18.
 */
public class Jet implements AccelerationMechanism {
    @Override
    public void accelerate() {
        System.out.println("JET: ignition and then acceleration!");
    }
}
