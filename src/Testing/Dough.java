/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing;

/**
 * Dough.java -
 * 
 * @since 10-Apr-2019 
 * @author r.stuchevsky
 */
public class Dough extends Food {
     public static final String[] DOUGHTYPES = {
        "FullGrain","Thicc","Thin","Soft","Italian","Cheese Fill"};
     public int choice;
    
    /**   
     * Default constructor for the class, sets class properties
     */
     public Dough(int choice) {
         this.choice = choice;

     }

     /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
     public static String toString(int type) {                     //try make static and call without instnasiacitong c;lass
        return "dough is " + DOUGHTYPES[type] + " ";
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

}
