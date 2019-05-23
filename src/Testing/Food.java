  package Testing;
/**
 * Food.java -
 * 
 * @since 10-Apr-2019 
 * @author r.stuchevsky
 */
public abstract class Food {
     /**   
     * Default constructor for the class, sets class properties
     */
     public Food() {
        
     }

     /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
     @Override
     public String toString() {
        return "Food " + super.toString();
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
   
     //public abstract void placeFood();
    //Shouldn't respond to a button press that activates the food
     //don't look here ronny
     //this is my best work
     /////////////yup
     ///./././././././././././././.:)
}
