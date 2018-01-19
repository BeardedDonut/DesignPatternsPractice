package TwoWayAdapter;

/**
 * Created by navid on 1/20/18.
 */

/*
    This Glove wraps human hand and maps it's gestures to 3d model hand and vice versa.
 */
public class VirtualRealityGlove implements VirtualHand, HumanHand {

    private ConcreteHumanHand humanHand;
    private VirtualHand3DModel virtualHand;

    public VirtualRealityGlove(ConcreteHumanHand realHumanHand, VirtualHand3DModel characterHand) {
        this.humanHand = realHumanHand;
        this.virtualHand = characterHand;
    }

    @Override
    public void collideWithSomething(String thing) {
        System.out.println("3d model has collided with " +
                thing +
                " in virtual world we have to change shape of hand according to it!");

        humanHand.touch(thing);
    }

    @Override
    public void grabAnimation(String thing) {
        System.out.println("3d model hand in virtual world has grabbed " +
                thing +
                " we have to change the shape of the hand on real world side to adapt to it");

        humanHand.grabSomething(thing);
    }

    @Override
    public void performOkAnimation() {
        System.out.println("3d model hand in virtual world is performing " +
                "ok gesture we have to adapt real human hand to its shape");

        humanHand.performGesture("ok");
    }

    @Override
    public void touch(String thing) {
        System.out.println("real human hand is touching something " +
                "we have to turn the 3d model shape to adapt to it!");
        virtualHand.collideWithSomething(thing);
    }

    @Override
    public void grabSomething(String thing) {
        System.out.println("real human hand is now grabbing " + thing);
        virtualHand.grabAnimation(thing);
    }

    @Override
    public void performGesture(String gesture) {
        System.out.println("human hand is performing some gesture we have to perform " +
                "the same gesture if we can (we don't have all the human hand" +
                " gesture animation available) on the virtual world side!");

        if(gesture.equals("ok")) {
            virtualHand.performOkAnimation();
        } else {
            System.err.println("gesture is not recognized!");
        }
    }


}
