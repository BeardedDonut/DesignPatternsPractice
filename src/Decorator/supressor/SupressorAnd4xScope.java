package Decorator.supressor;

import Decorator.abstractGun.Gun;

/**
 * Created by navid on 1/20/18.
 * This suppressor is kinda wierd
 */

public class SupressorAnd4xScope extends Gun {
    private Gun coreGun;

    public SupressorAnd4xScope(Gun coreGun) {
        this.coreGun = coreGun;
    }

    @Override
    public String shoot() {
        return "dup dup";
    }

    @Override
    public String aim() {
        return coreGun.aim() + " + 4x magnification";
    }

    @Override
    public float cost() {
        return coreGun.cost() + 59.99f;
    }
}
