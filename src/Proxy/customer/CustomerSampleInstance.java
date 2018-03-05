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
    private static int customerId = 0;

    public static void init() {
        if (customerId != 0) {
            customerId = (int) (Math.random() * 100);
        }
    }

    public static int getCustomerId() {
        if (customerId != 0) {
            init();
        }

        return customerId;
    }

    public static String reportCustomerTransactions(int customerId) {
        if (customerId != 0) {
            init();
        }

        StringBuilder sb = new StringBuilder();

        sb.append("{\n" +
                "\tcustomerId:" + customerId + "\n" +
                "\tsales:" + Math.random() * 100000 + "\n" +
                "\tpostalCode:" + Math.random() * 1000 + "\n" +
                "\tage:" + Math.random() * 60 + "\n}\n");

        return sb.toString();
    }
}
