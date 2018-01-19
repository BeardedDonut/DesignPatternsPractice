package TwoWayAdapter;

/**
 * Created by navid on 1/20/18.
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteHumanHand johnHand = new ConcreteHumanHand("john");
        VirtualHand3DModel johnCharacterHand = new VirtualHand3DModel();

        VirtualRealityGlove johnGlove = new VirtualRealityGlove(johnHand, johnCharacterHand);

        johnGlove.touch("john's room wall");
        System.out.println();

        johnGlove.grabAnimation("sword");
        System.out.println();

        johnGlove.performGesture("rock scissor paper (one of them)");
        System.out.println();

        johnGlove.collideWithSomething("another player's shield");
        System.out.println();


    }
}
