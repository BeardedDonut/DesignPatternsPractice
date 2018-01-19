package Mediator;

/**
 * Created by navid on 12/14/17.
 */
public class ConcreteColleague extends Colleague{
    private String name;

    public ConcreteColleague(String name, Mediator m) {
        super(m);
        this.name = name;
    }

    @Override
    public void recevie(String message) {
        System.out.println("Concrete Colleague:" + name + "\n\tHas received a message:" + message);
    }
}
