package Strategy;

/**
 * Created by navid on 12/15/17.
 */
public class Context {
    private SearchStrategy mySearchStrategy;

    public void setMySearchStrategy(SearchStrategy strategy) {
        this.mySearchStrategy = strategy;
    }

    public String search() {
        return "searching algorithm :" + mySearchStrategy.algorithm();
    }
}
