package Observer.subject;

import Observer.subscriber.Observer;

import java.util.ArrayList;

/**
 * Created by navid on 12/15/17.
 */
public class Subject {
    private ArrayList<Observer> subscribers;
    private int number;

    public Subject() {
        this.subscribers = new ArrayList<Observer>();
    }

    public void add(Observer o) {
        subscribers.add(o);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int value) {
        this.number = value;
        this.notifySubscribers();
    }

    public void notifySubscribers() {
        for (Observer subscriber: subscribers) {
            subscriber.update();
        }
    }
}
