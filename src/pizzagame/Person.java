package pizzagame;
import collections.LinkedList;
/**
 * Person.java - Abstract class that has an abstract method to give to its kid classes
 * @Instructor Mr.Wachs
 * @since 10-Apr-2019 
 * @author r.stuchevsky
 */
public abstract class Person {
    protected int low = 0; //passses to person so he can use to gen the order
    protected int high = 5; 
    /**
     * Randomizes an order out of the  4 linkedLists 
     * @param doughTypes the doughs to randomize from
     * @param cheeseTypes the cheeses to randomize from
     * @param sauceTypes the sauces to randomize from
     * @param toppingTypes the toppings to randomize from
     * @return 
     */
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
