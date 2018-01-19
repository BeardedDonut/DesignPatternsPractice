package Mediator;

/**
 * Created by navid on 12/14/17.
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator m) {
        this.mediator = m;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public Mediator getMediator() { return  mediator;}

    public abstract void recevie(String message);
}
