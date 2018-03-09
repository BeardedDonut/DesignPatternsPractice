package Observer.subscriber;

import Observer.subject.Subject;

/**
 * Created by navid on 12/15/17.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
