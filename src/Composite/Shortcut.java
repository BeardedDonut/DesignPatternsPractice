package Composite;

/**
 * Created by navid on 12/15/17.
 */
public class Shortcut extends File {
    private File linkToFile;

    public Shortcut(String name, File link) {
        this.name = name;
        this.linkToFile = link;
    }

    @Override
    public void remove(File file) {
        System.out.println("'Remove' method is implemented for shortcut");
    }

    @Override
    public void add(File file) {
        System.out.println("'Add' method is implemented for shortcut");
    }

    @Override
    public void copy() {
        System.out.println("copying :" + this.name);
    }

    @Override
    public void cut() {
        System.out.println("cutting " + this.name);
    }

    @Override
    public void describe(int level) {
        System.out.println(level+"-name :" + name);
        System.out.println(level+"-link to file:");
        linkToFile.describe(level);
    }
}
