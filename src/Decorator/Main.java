package Decorator;

import Decorator.gun.Bereta;
import Decorator.scope.RedDotScope;
import Decorator.supressor.BlackOpsSuppressor;

/**
 * Created by navid on 1/20/18.
 */
public class Main {
    public static void main(String[] args) {
        Bereta br = new Bereta();               // plain Bereta hand pistol
        System.out.println("Plain Bereta:");
        System.out.println("Aiming: " + br.aim());
        System.out.println("Shooting: " + br.shoot());
        System.out.println("Cost: " + br.cost());
        System.out.println();

        RedDotScope rds = new RedDotScope(br);  // decorating gun with red dot scope
        BlackOpsSuppressor bops = new BlackOpsSuppressor(rds); // decorating the red dot scope Bereta
        System.out.println("Bereta + Red-Dot + BlackOpsSuppressor:");
        System.out.println("Aiming: " + bops.aim());
        System.out.println("Shooting: " + bops.shoot());
        System.out.println("Cost: " + bops.cost());
        System.out.println();
    }
}
