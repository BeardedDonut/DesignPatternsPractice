package Visitor;

/**
 * Created by navid on 12/16/17.
 */
public class ConcreteElementOne implements Element {
    private int prop1;
    private String name;

    ConcreteElementOne(int prop1, String name) {
        this.prop1 = prop1;
        this.name = name;
    }

    public String describeMe() {
        return "name: " + this.name + "\n prop1: " + prop1;
    }

    public int getProp1() {
        return prop1;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
