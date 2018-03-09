package Observer;

import Observer.subscriber.Observer;
import Observer.subject.Subject;
import Observer.subscriber.HexObserver;
import Observer.subscriber.OctObserver;

/**
 * Created by navid on 12/15/17.
 */
public class Demo {
    public static void main(String... args) {

        // Creating some subjects
        Subject firstSubject = new Subject();

        // Create subscribers
        Observer observer1 = new OctObserver(firstSubject);
        Observer observer2 = new HexObserver(firstSubject);

        firstSubject.setNumber(2);

        firstSubject.setNumber(3);
    }
}
