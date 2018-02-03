package TwoWayAdapter2;

/**
 * Created by navid on 1/24/18.
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteA ca = new ConcreteA();
        ConcreteB cb = new ConcreteB();

        AToBAdapter a2bAdapter = new AToBAdapter(ca, cb);

        //calling interface A methods should return interfaceB corresponding methods result
        System.out.println("Calling interface A methods of A2B adapter");
        System.out.println(a2bAdapter.do1());
        System.out.println(a2bAdapter.do2());
        System.out.println();

        //calling interfaceB methods should return interfaceA corresponding methods result
        System.out.println("Calling interface B methods of A2B adapter");
        System.out.println(a2bAdapter.doOne());
        System.out.println(a2bAdapter.doTwo());
        System.out.println();
    }
}
