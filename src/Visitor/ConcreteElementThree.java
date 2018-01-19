package Visitor;

/**
 * Created by navid on 12/16/17.
 */
public class ConcreteElementThree implements Element {

    private String myName;

    ConcreteElementThree(String name) {
        this.myName = name;
    }

    public String description() {
        return "myName: " + myName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
