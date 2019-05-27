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
      int high = 5;
      int low = 0;
    
    /**   
     * Default constructor for the class, sets class properties
     */
     public VIP() {
        time = 30; //how much seconds
        setMoney(200); //amount of money given on success
         
         
     }

     
     
     /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
     @Override
     public boolean equals(Object object) {
        return super.equals(object);
     }

     /**
     * Createss a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
     @Override
     public VIP clone() {
     return this;
     }

    @Override
    public void timeUntilAngry() {
        
    }

    

    @Override
    public LinkedList<String> order(LinkedList<String> doughTypes, LinkedList<String> cheeseTypes, LinkedList<String> sauceTypes, LinkedList<String> toppingTypes) {
        LinkedList<String> order = new LinkedList<>();
        order.add(doughTypes.get(random(low, high)));
        order.add(sauceTypes.get(random(low, high)));
        order.add(cheeseTypes.get(random(low, high)));
        order.add(toppingTypes.get(random(low, high)));
        order.add(toppingTypes.get(random(low, high)));
        return order;
    }

    


}
