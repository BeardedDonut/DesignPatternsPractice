package Mediator;

import java.util.ArrayList;

/**
 * Created by navid on 12/14/17.
 */
public class ConcreteMediator extends Mediator {

    private ArrayList<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague newColleague) {
        this.colleagues.add(newColleague);
    }

    public void send(String message, Colleague messageOrigin) {
        // notify all the other colleagues except the message origin itself
        for(Colleague c: colleagues) {
            if(c != messageOrigin) {
                c.recevie(message);
            }
        }
    }



}
