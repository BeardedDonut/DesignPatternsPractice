package Adapter.human;

import Adapter.human.Human;
import Adapter.robot.Robot;

/**
 * Created by navid on 1/19/18.
 */
public class HumanLikeRobot extends Human {
    private Robot core;

    public HumanLikeRobot(String nickname,Robot core) {
        super(nickname);
        this.core = core;
    }

    @Override
    public void walk() {
        System.out.println("Walk:");
        core.move();
        System.out.println();
    }

    @Override
    public void saySomething() {
        System.out.println("Say Something:");
        core.printSomething();
        System.out.println();
    }

    @Override
    public void passCaptchaTest() {
        System.out.println("Pass Captcha:");
        core.passCaptcha();
        System.out.println();
    }

    @Override
    public void whoAreYou() {
        System.out.println("My nickname is:" + this.name);
        core.printId();
        System.out.println();
    }
}
