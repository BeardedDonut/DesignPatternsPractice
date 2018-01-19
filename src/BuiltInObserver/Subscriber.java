package BuiltInObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by navid on 1/19/18.
 */
public class Subscriber implements Observer {

    private Publisher myFavMagazinePublisher;

    public Subscriber(Publisher favoriteMag){
        this.myFavMagazinePublisher = favoriteMag;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer: change occurred!");
        if (o == myFavMagazinePublisher) {
            System.out.println("New Magazine:");
            System.out.println("Number: " + myFavMagazinePublisher.getNumber());
            System.out.println("Title: " + myFavMagazinePublisher.getTitle());
            System.out.println("Content: " + myFavMagazinePublisher.getText());
        }
    }
}
