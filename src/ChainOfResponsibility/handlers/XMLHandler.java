package ChainOfResponsibility.handlers;

import ChainOfResponsibility.infrastructure.AddRequest;
import ChainOfResponsibility.infrastructure.MediaType;

/**
 * Created by navid on 2/5/18.
 */
public class XMLHandler implements MyHttpAddReqHandler {
    MyHttpAddReqHandler nextHandler;

    public XMLHandler(MyHttpAddReqHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void setNextHandler(MyHttpAddReqHandler next) {
        this.nextHandler = next;
    }

    @Override
    public String handle(AddRequest req) {
        StringBuilder sb = new StringBuilder();

        if(!req.getDesiredMediaType().equals(MediaType.XML)) {
            return nextHandler.handle(req);
        }

        sb.append("XML format:\n");
        sb.append("<response>\n");
        sb.append("\t<firstParam name = 'A'> " + req.getA() + " </firstParam>\n");
        sb.append("\t<secondParam name = 'B'> " + req.getB() + " </secondParam>\n");
        sb.append("\t<result name = 'result'> " + (req.getA()+ req.getB()) + " </result>\n");
        sb.append("</response>\n");

        return sb.toString();
    }
}
