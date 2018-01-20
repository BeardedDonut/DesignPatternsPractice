package Decorator.gun;

import Decorator.abstractGun.Gun;

/**
 * Created by navid on 1/20/18.
 */

/*
    An instance of gun which we are going to decorate.
 */
public class Bereta extends Gun {
    @Override
    public String shoot() {
        return "pew pew";
    }

    @Override
    public String aim() {
        return "basic aiming";
    }

    @Override
    public float cost() {
        return 200.00f;
    }
}
