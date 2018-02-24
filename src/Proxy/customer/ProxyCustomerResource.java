package Proxy.customer;

/**
 * Created by navid on 2/16/18.
 */
public class ProxyCustomerResource implements CustomerResource {
    private RemoteCustomerResource myCustomerResource;

    ProxyCustomerResource() {
        /*
         NOTE:
         We should NOT instantiate the REMOTE-RESOURCE at the constructor
          otherwise it would be the same to use the connection in the first place.
        */
    }

    @Override
    public String request() throws InterruptedException {

        if (myCustomerResource == null) {
            this.createConnectionToRemoteServer();
        }

        // We can also provide some caching mechanism to improve the performance overall
        return myCustomerResource.request();
    }

    @Override
    public String getCustomerId() {
        return null;
    }

    public void createConnectionToRemoteServer() {
        this.myCustomerResource = new RemoteCustomerResource();
    }
}
