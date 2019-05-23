/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing;

/**
 * Sauce.java -
 * 
 * @since 10-Apr-2019 
 * @author r.stuchevsky
 */
public class Sauce extends Food {
    public static final String[] SAUCES = {
        "Italian","Home-Made","American","Spicy",
        "Louisana","Chipotle"};
     public int choice;
    /**   
     * Default constructor for the class, sets class properties
     */
     public Sauce(int choice) {
         this.choice = choice; 
         System.out.println(SAUCES[choice]);
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
     public Sauce clone() {
     return this;
     }
      /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
     public static String toString(int type) {
        return "sauce is " + SAUCES[type] + " ";
     }
     

}
