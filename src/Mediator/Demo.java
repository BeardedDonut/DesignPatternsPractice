package Mediator;

import Mediator.colleague.ConcreteColleague;
import Mediator.colleague.MobileColleague;
import Mediator.mediator.ConcreteMediator;

/**
 * Created by navid on 12/14/17.
 */
public class Demo {
    public static void main(String[] args) {
        // Create Mediator
        ConcreteMediator myMediator = new ConcreteMediator();

        // Create two Concrete Colleagues
        ConcreteColleague ccNumber1 = new ConcreteColleague("Concrete #1", myMediator);
        ConcreteColleague ccNumber2 = new ConcreteColleague("Concrete #2", myMediator);

        // Create three Mobile Colleagues
        MobileColleague mcNumber1 = new MobileColleague("Mobile #1", myMediator);
        MobileColleague mcNumber2 = new MobileColleague("Mobile #2", myMediator);
        MobileColleague mcNumber3 = new MobileColleague("Mobile #3", myMediator);

        // Register the created Colleagues in Mediator
        myMediator.addColleague(ccNumber1);
        myMediator.addColleague(ccNumber2);
        myMediator.addColleague(mcNumber1);
        myMediator.addColleague(mcNumber2);
        myMediator.addColleague(mcNumber3);

        ccNumber1.send("Salam man Concrete #1 am!");
        mcNumber1.send("Khob be ma Che?!");



    }
}
