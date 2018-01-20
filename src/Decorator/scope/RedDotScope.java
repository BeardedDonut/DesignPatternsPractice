package Decorator.scope;

import Decorator.abstractGun.Gun;

/**
 * Created by navid on 1/20/18.
 */
public class RedDotScope extends Gun {
    private Gun coreGun;

    public RedDotScope(Gun core) {
        this.coreGun = core;
    }

    @Override
    public String shoot() {
        return coreGun.shoot();
    }

    @Override
    public String aim() {
        return coreGun.aim() + "+ A Red Dot Scope(with no magnification)";
    }

    @Override
    public float cost() {
        return coreGun.cost() + 35.50f;
    }
}
