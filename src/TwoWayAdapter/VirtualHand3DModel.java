package TwoWayAdapter;

/**
 * Created by navid on 1/20/18.
 */
public class VirtualHand3DModel implements VirtualHand {


    @Override
    public void collideWithSomething(String thing) {
        System.out.println("Colliding with " + thing + " animation!");
    }

    @Override
    public void grabAnimation(String thing) {
        System.out.println("Grabbing " + thing + " animation!");
    }

    @Override
    public void performOkAnimation() {
        System.out.println("perform ok animation!");
    }
}
