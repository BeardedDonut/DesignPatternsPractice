package Adapter;

import Adapter.human.HumanLikeRobot;
import Adapter.robot.Robot;

/**
 * Created by navid on 1/19/18.
 */
public class Demo {
    public static void main(String[] args) {

        Robot newRobot = new Robot("T600 M2");
        HumanLikeRobot hooman = new HumanLikeRobot("Hooman", newRobot);

        hooman.whoAreYou();
        hooman.saySomething();
        hooman.walk();
        hooman.passCaptchaTest();

    }
}
