package Adapter;

/**
 * Created by navid on 1/19/18.
 */
public class Robot {
    private String productId;

    Robot(String productId) {
        this.productId = productId;
    }

    public void printId(){
        System.out.println("product Id: " + productId);
    }

    public void move() {
        System.out.println("moving from a to b;");
    }

    public void printSomething() {
        System.out.println("printing!");
        System.out.println("1001 1000 1110 1011");
        System.out.println("1111 1100 1100 0011");
        System.out.println("1001 1110 1010 1111");
    }

    public void passCaptcha() {
        System.out.println("(Throws Exception...)");
    }
}
