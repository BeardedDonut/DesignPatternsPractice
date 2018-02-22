package Composite.file;

/**
 * Created by navid on 12/15/17.
 */
public abstract class File {
    protected String name;

    public abstract void remove(File file);
    public abstract void add(File file);
    public abstract void copy();
    public abstract void cut();
    public abstract void describe(int level);
}
