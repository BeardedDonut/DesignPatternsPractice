package Decorator.abstractGun;

/**
 * Created by navid on 1/20/18.
 */
public abstract class Gun {
    /**
     * This method represent the sound each
     * gun makes when it fires
     * @return
     */
    public abstract String shoot();

    /**
     * This method represent how aiming is done
     * @return
     */
    public abstract String aim();

    /**
     * This method return the cost of the gun or decorated gun
     * @return
     */
    public abstract float cost();
}
