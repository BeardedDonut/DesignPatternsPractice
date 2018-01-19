package Mediator;

/**
 * Created by navid on 12/14/17.
 */
public class MobileColleague extends Colleague {
    private String name;

    public MobileColleague(String name, Mediator m) {
        super(m);
        this.name = name;
    }

    @Override
    public void recevie(String message) {
        System.out.println("Mobile Colleague:" + name + "\n\tHas received a message:" + message);
    }
}
