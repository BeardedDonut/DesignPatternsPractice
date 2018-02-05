package ChainOfResponsibility.handlers;

import ChainOfResponsibility.AddRequest;

/**
 * Created by navid on 2/5/18.
 */
public class JSONHandler implements MyHttpAddReqHandler {
    @Override
    public void setNextHandler(MyHttpAddReqHandler next) {

    }

    @Override
    public String handle(AddRequest req) {
        return null;
    }
}
