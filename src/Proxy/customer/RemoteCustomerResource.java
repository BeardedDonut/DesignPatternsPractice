package Proxy.customer;

/**
 * Created by navid on 2/16/18.
 */
public class RemoteCustomerResource implements CustomerResource {

    @Override
    public String request(int id) throws InterruptedException {
        System.out.println("Generating Report For the Given Customer");
        // The remote server should make the report which is a heavy task.
        Thread.sleep(10000L);

        return CustomerSampleInstance.reportCustomerTransactions(id);
    }

    @Override
    public int getCustomerId() throws InterruptedException {
        // The remote server should fetch the customer Id which is not so heavy but it is still time consuming.
        Thread.sleep(10L);

        return CustomerSampleInstance.getCustomerId();
    }
}
