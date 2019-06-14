package pizzagame;
import collections.LinkedList;
/**
 * Customer.java - The customer class it a child to the abstract person class and 
 * can randomize and order, Plays y the rules of the PizzaOrder
 * @since 10-May-2019 
 * @author r.stuchevsky
 */
public class Customer extends Person implements PizzaOrder {
    /**   
     * Default constructor for the class, sets class properties
     */
     public Customer() {  
     }
    /**
     * An abstract method inforced by the Person class that generates a random order 
     * of pizza from diffrent ingridients and adds them to the UI order list
     * @param doughTypes the doughs to generate from (LinkedList)
     * @param sauceTypes the sauce to generate from (LinkedList)
     * @param cheeseTypes the cheeses to generate from (LinkedList)
     * @param toppingTypes the toppings to generate from (LinkedList)
     * @return the Customer order to work with
     */
    @Override
    public LinkedList<String> order(LinkedList<String> doughTypes, LinkedList<String> sauceTypes, LinkedList<String> cheeseTypes, LinkedList<String> toppingTypes) {
        LinkedList<String> order = new LinkedList<>();
        order.add(doughTypes.get(random(low, high)));
        order.add(sauceTypes.get(random(low, high)));
        order.add(cheeseTypes.get(random(low, high)));
        order.add(toppingTypes.get(random(low, high)));
        return order;
    }
}
