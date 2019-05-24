

package pizzagame;

import collections.LinkedList;
/**
 * Engine.java -
 * 
 * @since 6-May-2019 
 * @author r.stuchevsky
 */
public class Engine{
     public Engine() {
     String[] cheeses = {
        "Mozzarela","Swiss","Old-Fort",
        "Cheddar","Provolone","Parmigian","Feta"};
     
     
     
     LinkedList<String> doughTypes = new LinkedList<>();
     LinkedList<String> toppingTypes = new LinkedList<>();
     LinkedList<String> cheeseTypes = new LinkedList<>(cheeses);
     LinkedList<String> sauceTypes = new LinkedList<>();
        
       
        
        
     } 

    //ai will create linked list of ingridients from the classes called order there is going to be 2 types
    //normalOrder and vipOrder
     //player will need to complete them by using buttons in a select time
     //liked list will only check for the size and if the items are all thre in no particular order
     //if all the items are there the player will be rewared mney which will be displayed
     //OPTIONAL: player will have 45 seconds to complete order but timer class needs to be build and used (idk how)
     //At the start of the game player could choose his name that will also be displayed
     //game ends when a) player fails to complete an order or b)(prefered) timer runs out
     // OPTIONAL player has 3 hearts if player fails an order one heart goes down until game ends
     // stuff that could sneak in: A recursion method, and maybe some abstract class and methods should be good
     //than user will build its own linked lsit uding the buttons and the 2 lsit will be checked for the same contens insdie them
     //than user linked list will be cleared rinse repeat while a new customerr will spawn with a recursion method or something
     //and classes would be used to like connect bettwen the stuff
     
    /**
     * generate random double
     * @param low the lowest double in the range
     * @param high the highest double in the range
     * @return the generated number
     */        
    public static double random(double low, double high){
        return (high - low + 1d) * Math.random() + low;
    }
    /**
     * generates random integer
     * @param low the lowest integer in the range
     * @param high the highest integer in the range
     * @return the generated number
     */
    public static int random(int low, int high){
        return (int) (random((double)low, (double)high));
    }

}