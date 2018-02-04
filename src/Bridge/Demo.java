package Bridge;

import Bridge.accelerator.Jet;
import Bridge.accelerator.Propeller;
import Bridge.vehicle.Submarine;

/**
 * Created by navid on 2/2/18.
 */
public class Demo {
    public static void main(String... args) {
        Propeller prop = new Propeller();
        Jet jet = new Jet();

        Submarine sbMarine = new Submarine(jet);    // a submarine which uses Jet as an acceleration mechanism!
        sbMarine.move();

        Submarine sbMarine2 = new Submarine(prop);  // another submarine which uses Propeller as AM
        sbMarine2.move();

    }
}
