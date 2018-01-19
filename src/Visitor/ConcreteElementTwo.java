package Visitor;

/**
 * Created by navid on 12/16/17.
 */
public class ConcreteElementTwo implements Element {

    private float firstProperty;
    private int secondProperty;

    ConcreteElementTwo(float firstProperty, int secondProperty) {
        this.firstProperty = firstProperty;
        this.secondProperty = secondProperty;
    }

    public String describeMe() {
        return "firstProperty: "+ firstProperty + "\n secondProperty: " + secondProperty;
    }

    public float getFirstProperty() {
        return this.firstProperty;
    }

    public int getSecondProperty() {
        return this.secondProperty;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
