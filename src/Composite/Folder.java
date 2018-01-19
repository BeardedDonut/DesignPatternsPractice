package Composite;

import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.util.ArrayList;

/**
 * Created by navid on 12/15/17.
 */
public class Folder extends File {

    private ArrayList<File> myFiles = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void remove(File file) {
        this.myFiles.remove(file);
    }

    @Override
    public void add(File file) {
        this.myFiles.add(file);
    }

    @Override
    public void copy() {
        System.out.println("copying " + this.name);
    }

    @Override
    public void cut() {
        System.out.println("cutting " + this.name);
    }

    @Override
    public void describe(int level) {
        System.out.println("-name:" + name);
        System.out.println("-Folder Contains:");
        for (File f: myFiles) {
            f.describe(level + 1);
        }
    }
}
