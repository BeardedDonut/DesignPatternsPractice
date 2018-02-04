package Bridge.vehicle;

import Bridge.accelerator.AccelerationMechanism;

/**
 * Created by navid on 2/3/18.
 *
 * Vehicle is an abstract class which all other Vehicles
 * such as Submarine and Spaceship should drive from!
 */
public abstract class Vehicle {
    protected AccelerationMechanism myAccelerator;

    /**
     * Constructor.
     * @param myAccelerator Given acceleration mechanism!
     */
    Vehicle(AccelerationMechanism myAccelerator) {
        this.myAccelerator = myAccelerator;
    }

    /**
     * Definitely self explanatory!
     */
    public void move() {
        System.out.println("moving!");

        myAccelerator.accelerate();

        System.out.println();
    }
}
