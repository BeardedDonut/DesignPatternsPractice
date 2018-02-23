package Composite;

import Composite.file.Folder;
import Composite.file.Shortcut;
import Composite.file.TextFile;

/**
 * Created by navid on 12/15/17.
 */
public class Demo {
    public static void main(String... args) {

        TextFile textFile1 = new TextFile("text1.txt", "Hello World!");
        TextFile textFile2 = new TextFile("password.txt", "1234qwer");

        Shortcut shortcut1 = new Shortcut("text-Alias", textFile1);


        Folder favourites = new Folder("fav");
        favourites.add(textFile1);
        favourites.add(textFile2);
        favourites.add(shortcut1);

        TextFile txt3 = new TextFile("bookmarks.txt", "www.google.com");
        TextFile txt4 = new TextFile("Friend's StdNumber.txt", "Navid-93124___\nJohn-931234___\n...");
        TextFile txt5 = new TextFile("Friend's dialogues.txt", "Joey: How You Doing?!\nChandler:<Something Sarcastic>");

        Folder secretFiles = new Folder("secret");
        secretFiles.add(txt3);
        secretFiles.add(txt4);
        secretFiles.add(txt5);

        favourites.add(secretFiles);

        favourites.describe(0);
    }
}
