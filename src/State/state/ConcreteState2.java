package State.state;

import State.context.Context;


/**
 * Created by navid on 12/15/17.
 * SingleTon
 */
public class ConcreteState2 extends State {
    private static State instance = new ConcreteState2();

    private ConcreteState2() {
        super();
    }

    public static State getInstance() {
        return instance;
    }

    @Override
    public void goNext(Context context) {
        context.setState(ConcreteState3.getInstance());
    }

    @Override
    public void describeState() {
        System.out.println("This is State 2 and next will be State 3");
    }
}
