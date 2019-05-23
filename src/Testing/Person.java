/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing;

/**
 * Person.java -
 * 
 * @since 10-Apr-2019 
 * @author r.stuchevsky
 */
public abstract class Person {
    protected int time; // Need timer class, Should be a random between 15-45 seconds
    protected int order; // the full order that a customer has 
    private int money;
    
     public Person() {
        
     }
     
     public void leave(){ //when timer runs out should be abstract
         System.out.println("Yuk im leaving"); 
     }
     
     public abstract void order();
     
     public int getMoney(){
         return money;
     }
     
     public int setMoney(int money){
         this.money = money;
         return money; 
     }
     
     
    
     /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
     @Override
     public String toString() {
        return "Person " + super.toString();
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
     public Person clone() {
     return this;
     }

     public abstract void TimeUntilAngry();
     
     
}
