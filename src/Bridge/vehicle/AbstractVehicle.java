package Bridge.vehicle;

import Bridge.accelerator.AbstractAccelerator;

/**
 * Created by navid on 2/3/18.
 */
public abstract class AbstractVehicle {
    protected AbstractAccelerator myAccelerator;

    public abstract void move();
}
