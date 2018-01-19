package Observer;

import java.util.ArrayList;

/**
 * Created by navid on 12/15/17.
 */
public class Subject {
    private ArrayList<Observer> subscribers;
    private int state;

    Subject() {
        this.subscribers = new ArrayList<Observer>();
    }

    public void add(Observer o) {
        subscribers.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int value) {
        this.state = value;
        this.notifySubscribers();
    }

    public void notifySubscribers() {
        for (Observer subscriber: subscribers) {
            subscriber.update();
        }
    }
}
