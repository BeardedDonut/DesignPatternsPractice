package TwoWayAdapter;

/**
 * Created by navid on 1/20/18.
 */
public class ConcreteHumanHand implements HumanHand {
    String humanName;

    public ConcreteHumanHand(String humanName) {
        this.humanName = humanName;
    }

    @Override
    public void touch(String thing) {
        System.out.println( humanName + " is touching " + thing + " with fingers!");
    }

    @Override
    public void grabSomething(String thing) {
        System.out.println(humanName + " is grabbing " + thing + " with fingers!");
    }

    @Override
    public void performGesture(String gesture) {
        System.out.println(humanName + " is performing " + gesture);
    }
}
