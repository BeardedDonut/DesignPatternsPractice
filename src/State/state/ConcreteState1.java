package State.state;

import State.context.Context;


/**
 * Created by navid on 12/15/17.
 * SingleTon
 */
public class ConcreteState1 extends State {
    private static State instance = new ConcreteState1();

    private ConcreteState1() {
        super();
    }

    public static State getInstance() {
        return instance;
    }

    @Override
    public void goNext(Context context) {
        context.setState(ConcreteState2.getInstance());
    }


    @Override
    public void describeState() {
        System.out.println("This is State 1 and next will be State 2");
    }
}
