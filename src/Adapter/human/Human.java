package Adapter.human;

/**
 * Created by navid on 1/19/18.
 */
public class Human {
    protected String name;

    Human(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("Walking Smoothly...");
    }

    public void saySomething() {
        System.out.println("Hello There!");
    }

    public void passCaptchaTest() {
        System.out.println("just pass!");
    }

    public void whoAreYou() {
        System.out.println("I am " + name);
    }
}
