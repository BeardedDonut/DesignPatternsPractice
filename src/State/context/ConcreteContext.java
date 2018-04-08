package State.context;

import State.state.State;

/**
 * Created by navid on 12/15/17.
 */
public class ConcreteContext extends Context {

    @Override
    public void goNext() {
        this.currentState.goNext(this);
    }

    @Override
    public void setState(State newState) {
        this.currentState = newState;
    }

    @Override
    public void describe() {
        System.out.println("This is concrete Context! and my state description is:");
        currentState.describeState();
    }
}
