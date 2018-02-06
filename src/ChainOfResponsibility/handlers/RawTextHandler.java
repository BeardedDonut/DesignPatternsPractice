package ChainOfResponsibility.handlers;

import ChainOfResponsibility.infrastructure.AddRequest;

/**
 * Created by navid on 2/6/18.
 */
public class RawTextHandler implements MyHttpAddReqHandler {

    @Override
    public void setNextHandler(MyHttpAddReqHandler next) {
    }

    @Override
    public String handle(AddRequest req) {
        StringBuilder sb = new StringBuilder();

        sb.append("RAW-TEXT format:\n");
        sb.append("a = " + req.getA() + ", b = " + req.getB() + " ==> a + b = " + (req.getA() + req.getB()) + "\n");

        return sb.toString();
    }
}
