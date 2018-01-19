package BuiltInObserver;

/**
 * Created by navid on 1/19/18.
 */
public class Demo {

    public static void main(String[] args) {
        Publisher forbes = new Publisher(1,
                "How to get rich?",
                "It's simple, just get rich");

        Publisher batmanComicBook = new Publisher(1,
                "Batman: Begins",
                "... and eventually Batman kicks Ra's Al Ghul and saves Gotham!");


        Subscriber john = new Subscriber(forbes);
        forbes.addObserver(john);

        Subscriber galahad = new Subscriber(batmanComicBook);
        Subscriber david = new Subscriber(batmanComicBook);

        batmanComicBook.addObserver(david);
        batmanComicBook.addObserver(galahad);

        System.out.println("new batman comic books releases");
        batmanComicBook.publishNewContent("Batman: The Dark Knight",
                "... and eventually Batman kicks Joker and saves Gotham!");
        System.out.println();

        System.out.println("new release for forbes magazine");
        forbes.publishNewContent("Introduction to Software Industry", "Software industry is good!");
        System.out.println();


        System.out.println("new batman comic books releases");
        batmanComicBook.publishNewContent("Batman: Dark knight Rises",
                "... and eventually Batman kicks Bane, and someone else and saves Gotham!");
        System.out.println();


    }
}
