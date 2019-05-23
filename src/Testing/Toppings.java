/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing;

/**
 * Toppings.java -
 * 
 * @since 10-Apr-2019 
 * @author r.stuchevsky
 */
public class Toppings extends Food {
    public static final String[] TOPPINGS = {
        "Peperoni","Ham","Salami","Pineapple",
        "Mushrooms","Peppers"};
     public int choice;
     /**   
     * Default constructor for the class, sets class properties
     */
     public Toppings(int choice) {
        this.choice = choice;
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
     * String representation of this object
     *
     * @return The object represented as a String
     */
     public static String toString(int type) {
        return "topping is " + TOPPINGS[type] + " ";
     }
     


}
