package State;

import State.context.ConcreteContext;
import State.state.ConcreteState1;

/**
 * Created by navid on 12/15/17.
 */
public class Demo {
    public static void main(String... args) {

        // Creating a context
        ConcreteContext context = new ConcreteContext();
        context.setState(ConcreteState1.getInstance());

        // try changing the state for 10 times
        for (int i = 0; i < 10; i++) {
            context.describe();
            context.goNext();
        }
    }
}
