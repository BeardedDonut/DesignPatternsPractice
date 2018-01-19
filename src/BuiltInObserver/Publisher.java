package BuiltInObserver;

import java.util.Observable;

/**
 * Created by navid on 1/19/18.
 */
public class Publisher extends Observable {

    private int number;     // Publication number
    private String title;   // Title of the Magazine
    private String text;    // Content of the Magazine

    /*
        -----------------------------------------------------------------------------------
        |   In order to use Observable class we have to notify changes when any happens...
        |
        |   So it would be much easier to do if change the access modifiers of properties
        |   to "private" and then provide some setters in order to change them so we could
        |   have more control over changes and also whenever a change happens through setters
        |   we can notify the observers!
        |
        -----------------------------------------------------------------------------------
     */

    public Publisher(int number, String title, String text){
        this.number = number;
        this.title = title;
        this.text = text;
    }

    public void publishNewContent(String title, String text) {
        number++;
        this.title = title;
        this.text = text;

        setChanged();
        notifyObservers();
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
