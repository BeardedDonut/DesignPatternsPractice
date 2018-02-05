package ChainOfResponsibility.handlers;

import ChainOfResponsibility.AddRequest;

/**
 * Created by navid on 2/5/18.
 */
public interface MyHttpAddReqHandler {

    void setNextHandler(MyHttpAddReqHandler next);
    String handle(AddRequest req);

}
