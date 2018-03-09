package Observer.subscriber;

import Observer.subject.Subject;

/**
 * Created by navid on 12/15/17.
 */
public class OctObserver extends Observer {

    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("OCT " + Integer.toOctalString(this.subject.getNumber()));
    }
}
