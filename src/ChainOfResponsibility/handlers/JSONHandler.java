package ChainOfResponsibility.handlers;

import ChainOfResponsibility.infrastructure.AddRequest;
import ChainOfResponsibility.infrastructure.MediaType;

/**
 * Created by navid on 2/5/18.
 */
public class JSONHandler implements MyHttpAddReqHandler {
    MyHttpAddReqHandler nextHandler;

    public JSONHandler(MyHttpAddReqHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void setNextHandler(MyHttpAddReqHandler next) {
        this.nextHandler = next;
    }

    @Override
    public String handle(AddRequest req) {
        StringBuilder sb = new StringBuilder();

        if(!req.getDesiredMediaType().equals(MediaType.JSON)) {
            return nextHandler.handle(req);
        }

        sb.append("JSON format:\n");
        sb.append("`result`: {\n");
        sb.append("\t'A': " + req.getA() + "\n");
        sb.append("\t'B':" + req.getB() + "\n");
        sb.append("\t'result':" + (req.getA()+ req.getB()) + "\n");
        sb.append("}\n");

        return sb.toString();
    }
}
