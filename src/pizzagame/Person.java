/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzagame;

import collections.LinkedList;

/**
 * Person.java -
 * 
 * @since 10-Apr-2019 
 * @author r.stuchevsky
 */
public abstract class Person {
    protected int low = 0;
    protected int high = 5; 
     public Person() {
        
     }
     public abstract void timeUntilAngry();
     public abstract LinkedList<String> order(LinkedList<String> doughTypes,
             LinkedList<String> cheeseTypes,LinkedList<String> sauceTypes,LinkedList<String> toppingTypes);
     /**
     * generate random double
     * @param low the lowest double in the range
     * @param high the highest double in the range
     * @return the generated number
     */        
    protected double random(double low, double high){
        return (high - low + 1d) * Math.random() + low;
    }
    /**
     * generates random integer
     * @param low the lowest integer in the range
     * @param high the highest integer in the range
     * @return the generated number
     */
    protected int random(int low, int high){
        return (int) (random((double)low, (double)high));
    }
     
}
