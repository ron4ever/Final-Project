/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing;

/**
 * Cheese.java -
 * 
 * @since 10-Apr-2019 
 * @author r.stuchevsky
 */
public class Cheese extends Food {
    public static final String[] CHEESETYPES = {
        "Mozzarela","Swiss","Old-Fort",
        "Cheddar","Provolone","Parmigian","Feta"};
    public int choice;
    /**   
     * Default constructor for the class, sets class properties
     */
     public Cheese(int choice) {
        this.choice = choice;
         
         
     }

     /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
     @Override
     public String toString() {
        return "Cheese " + super.toString();
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
     public Cheese clone() {
     return this;
     }
 /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
     public static String toString(int type) {
        return "cheese is " + CHEESETYPES[type] + " ";
     }
     

}
