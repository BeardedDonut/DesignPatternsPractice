package Strategy;

/**
 * Created by navid on 12/15/17.
 */
public class Demo {
    public static void main(String... args) {
        Context searchContext = new Context();

        searchContext.setMySearchStrategy(new DepthFirstSearch());
        System.out.println(searchContext.search());

        searchContext.setMySearchStrategy(new BestFirstSearch());
        System.out.println(searchContext.search());

        searchContext.setMySearchStrategy(new RandomSearch());
        System.out.println(searchContext.search());
    }
}
