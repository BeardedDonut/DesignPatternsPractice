package Proxy.customer;

/**
 * Created by navid on 2/16/18.
 */
public class ProxyCustomerResource implements CustomerResource {
    private RemoteCustomerResource myCustomerResource;

    // cache
    private int customerIdCache;
    private String cachedReport;

    public ProxyCustomerResource() {
        /*
         NOTE:
         We should NOT instantiate the REMOTE-RESOURCE at the constructor
          otherwise it would be the same to use the connection in the first place.
        */
    }

    @Override
    public String request(int id) throws InterruptedException {

        if (myCustomerResource == null) {
            this.createConnectionToRemoteServer();
        }

        if (cachedReport == null) {
            this.cachedReport = myCustomerResource.request(id);
        }

        return cachedReport;
    }

    @Override
    public int getCustomerId() throws InterruptedException {
        if (myCustomerResource == null) {
            this.createConnectionToRemoteServer();
        }

        if (customerIdCache == 0) {
            customerIdCache = myCustomerResource.getCustomerId();
        }

        return customerIdCache;
    }

    private void createConnectionToRemoteServer() {
        this.myCustomerResource = new RemoteCustomerResource();
    }
}
