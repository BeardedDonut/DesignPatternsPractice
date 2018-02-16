package Proxy.customer;

/**
 * Created by navid on 2/16/18.
 * Customer Resource interface...
 * NOTE: Adapter design pattern could be very helpful if the two interface does not match.
 */
public interface CustomerResource {
    String request();
    String getCustomerId();
}
