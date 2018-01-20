package Decorator.supressor;

import Decorator.abstractGun.Gun;

/**
 * Created by navid on 1/20/18.
 */
public class BlackOpsSuppressor extends Gun {
    private Gun coreGun;

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
