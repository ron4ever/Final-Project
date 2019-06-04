/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzagame;

import collections.LinkedList;
import static pizzagame.Engine.random;



/**
 * Customer.java -
 * 
 * @since 10-Apr-2019 
 * @author r.stuchevsky
 */
public class Customer extends Person implements PizzaOrder {
   
    
    /**   
     * Default constructor for the class, sets class properties
     */
     public Customer() {
     
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
        return order;
    }
    
    
}
