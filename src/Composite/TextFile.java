package Composite;

/**
 * Created by navid on 12/15/17.
 */
public class TextFile extends File {
    private String text;

    public TextFile(String name, String text) {
        this.name = name;
        this.text = text;
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
        System.out.println(level+"-name:" + this.name);
        System.out.println(level+"-Text file:");
        System.out.println(level+"-"+this.text);
    }
}
