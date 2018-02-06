package ChainOfResponsibility.infrastructure;

import ChainOfResponsibility.handlers.JSONHandler;
import ChainOfResponsibility.handlers.MyHttpAddReqHandler;
import ChainOfResponsibility.handlers.RawTextHandler;
import ChainOfResponsibility.handlers.XMLHandler;

/**
 * Created by navid on 2/6/18.
 */
public class WebService {
    private MyHttpAddReqHandler myChainOfHandlers;

    public WebService() {

        // creating and chaining handlers
        RawTextHandler myRawHandler = new RawTextHandler();
        XMLHandler myXmlHandler = new XMLHandler(myRawHandler);
        JSONHandler myJsonHandler = new JSONHandler(myXmlHandler);

        this.myChainOfHandlers = myJsonHandler;
    }

    public WebService(MyHttpAddReqHandler chain) {
        this.myChainOfHandlers = chain;
    }


    public String handleRequest(AddRequest addReq) {
        return myChainOfHandlers.handle(addReq);
    }

}
