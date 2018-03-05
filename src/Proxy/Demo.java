package Proxy;

import Proxy.customer.CustomerResource;
import Proxy.customer.CustomerSampleInstance;
import Proxy.customer.ProxyCustomerResource;
import Proxy.customer.RemoteCustomerResource;

/**
 * Created by navid on 2/16/18.
 */
public class Demo {
    public static void main(String[] args) {
        /*
         * Let's define two different scenarios that a little bit of possibility to our project.
         * Imagine a scenario which we might need to fetch a customer report or we wont.
         * First initialize the customer so could have some customer t fetch data from!
         */
        CustomerSampleInstance.init();

        ProxyCustomerResource proxyCs = new ProxyCustomerResource();

        boolean possibility = Math.random() > .5f;

        try {
            for (int i = 0; i < 3; i++) {
                long begin = System.nanoTime();

                System.out.println(" ------------ ");
                if (possibility) {  // inject the chance Element!
                    System.out.println(proxyCs.getCustomerId());
                    System.out.println(proxyCs.request(proxyCs.getCustomerId()));
                }
                long end = System.nanoTime();
                System.out.println("time passed = " + (end - begin) / 1000);
                System.out.println(" -------END----- \n");

                possibility = Math.random() > .5f;
            }
        } catch (Exception e) {
            System.err.println("Oops something went wrong!");
        }



    }
}
