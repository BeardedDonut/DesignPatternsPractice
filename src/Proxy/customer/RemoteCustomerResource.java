package Proxy.customer;

/**
 * Created by navid on 2/16/18.
 */
public class RemoteCustomerResource implements CustomerResource {

    @Override
    public String request() {
        // The remote server should make the report which is a heavy task.
        return null;
    }

    @Override
    public String getCustomerId() {
        // The remote server should fetch the customer Id which is not so heavy.
        return null;
    }
}
