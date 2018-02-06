package ChainOfResponsibility;

import ChainOfResponsibility.infrastructure.AddRequest;
import ChainOfResponsibility.infrastructure.MediaType;
import ChainOfResponsibility.infrastructure.WebService;

/**
 * Created by navid on 2/5/18.
 */
public class Demo {
    public static void main(String... args) {

        // creating different request
        AddRequest addReq1 = new AddRequest(12, 15, MediaType.TEXT);
        AddRequest addReq2 = new AddRequest(3, 4, MediaType.XML);
        AddRequest addReq3 = new AddRequest(7, 1, MediaType.JSON);

        // creating our web-service with default chain of handlers
        WebService ws = new WebService();

        // sending request and printing the result
        System.out.println("req1:");
        System.out.println(ws.handleRequest(addReq1));

        System.out.println("req2:");
        System.out.println(ws.handleRequest(addReq2));

        System.out.println("req3:");
        System.out.println(ws.handleRequest(addReq3));

    }
}
