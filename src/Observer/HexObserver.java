package Observer;

/**
 * Created by navid on 12/15/17.
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Hex " + Integer.toHexString(this.subject.getState()));
    }
}
