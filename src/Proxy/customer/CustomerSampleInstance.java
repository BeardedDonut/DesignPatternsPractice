package Proxy.customer;

import java.util.Random;

/**
 * Created by navid on 2/24/18.
 * A sample Customer...
 *
 * NOTE:    since it is just a sample I have decided to define
 *          everything static and make the whole thing randomly
 *          but also note that we assume these processes take
 *          action in the remote server.
 */

public class CustomerSampleInstance {
    private static int customerId;

    public static int getCustomerId() {
        return (int) (Math.random() * 100);
    }

    public static String reportCustomerTransactions(int customerId) {
        StringBuilder sb = new StringBuilder();

        sb.append("{" +
                "customerId:" + customerId + "\n" +
                "sales:" + Math.random() * 100000+ "\n" +
                "postalCode:" + Math.random() * 1000 + "\n" +
                "age:" + Math.random() * 60 + "}\n");

        return sb.toString();
    }
}
