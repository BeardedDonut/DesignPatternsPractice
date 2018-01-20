package Decorator.supressor;

import Decorator.abstractGun.Gun;

/**
 * Created by navid on 1/20/18.
 * This is a black ops forces special which
 * removes the sound of any gun.
 */
public class BlackOpsSuppressor extends Gun {
    private Gun coreGun;    // a reference to the gun which we are decorating

    /*
        Changing each behaviour as we desire...
        We can either append something to them or entirely
        do something else instead.
     */
    public BlackOpsSuppressor(Gun coreGun) {
        this.coreGun = coreGun;
    }

    @Override
    public String shoot() {
        return "(no sound of "+ coreGun.shoot() + ")";
    }

    @Override
    public String aim() {
        return coreGun.aim();
    }

    @Override
    public float cost() {
        return coreGun.cost() + 12.00f;
    }
}
