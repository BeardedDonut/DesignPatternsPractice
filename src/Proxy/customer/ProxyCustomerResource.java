package Proxy.customer;

/**
 * Created by navid on 2/16/18.
 */
public class ProxyCustomerResource implements CustomerResource {
    private RemoteCustomerResource myCustomerResource;

    @Override
    public String request() {
        return null;
    }

    @Override
    public String getCustomerId() {
        return null;
    }
}
