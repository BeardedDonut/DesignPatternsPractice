package State;

/**
 * Created by navid on 12/15/17.
 */
public abstract class Context {
    protected State currentState;

    public abstract void goNext();

    public abstract void setState(State newState);

    public abstract void describe();
}
