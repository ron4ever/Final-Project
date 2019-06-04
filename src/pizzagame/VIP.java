package pizzagame;

import collections.LinkedList;
import static pizzagame.Engine.random;

/**
 * VIP.java - extends customer
 * 
 * @since 10-Apr-2019 
 * @author r.stuchevsky
 */
public class VIP extends Person{
     
    
    /**   
     * Default constructor for the class, sets class properties
     */
     public VIP() {   
     }

     
     
     
    @Override
    public void timeUntilAngry() {
        
    }

    

    @Override
    public LinkedList<String> order(LinkedList<String> doughTypes, LinkedList<String> cheeseTypes, LinkedList<String> sauceTypes, LinkedList<String> toppingTypes) {
        LinkedList<String> order = new LinkedList<>();
        order.add(doughTypes.get(random(low, high)));
        order.add(cheeseTypes.get(random(low, high)));
        order.add(sauceTypes.get(random(low, high)));
        order.add(toppingTypes.get(random(low, high)));
        order.add(toppingTypes.get(random(low, high)));
        return order;
    }

        
}
