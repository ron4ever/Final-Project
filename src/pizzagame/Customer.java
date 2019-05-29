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
public class Customer extends Person {
    int doughType;
    int cheeseType;
    int toppingType;
    int sauceType;
    
    int high = 5;
    int low = 0;
    
    /**   
     * Default constructor for the class, sets class properties
     */
     public Customer() {
        //random between 15-45 sec time
         setMoney(20); //amount of money gievn on success
         //and timer
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
