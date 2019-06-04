package pizzagame;
import collections.LinkedList;
import static pizzagame.PizzaOrder.cheeseTypes;
import static pizzagame.PizzaOrder.doughTypes;
import static pizzagame.PizzaOrder.sauceTypes;
import static pizzagame.PizzaOrder.toppingTypes;
/**
 * Engine.java -
 * 
 * @since 6-May-2019 
 * @author r.stuchevsky
 */
public class Engine{
    //properties of the class
    
    private final int low = 0;
    private final int high = 5;
    
    
    
    /**
     * Constructor of the class sets userList and customer order
     */
    public Engine() {
       UI ui = new UI();
        
     } 
    //TO DO LIST - STUFF CAN BE ADDED EVERYDAY
    //ui title of game  - done
    //right display size 
    //Welcome UI screen with a play btn instructions and exit and credits title with the 2names and i wanna be mercy - done
    //how to put picture in the label - done (icon) (and it has to be in package)
    //recursion? maybe in the customer spawn method kinda tricky gotta tackle that at one point for the whole game to work (core)
    //music - nick
    //UI - button adds ingirdient to the userlist (in progress) new add method in linked thats adds the index at the spot i say
    //method to earase userlist - done (finalize)
    //hearts - done
    //graphics - in progress
    //money - done
    //At the start of the game player could choose his name that will also be displayed - done
    //Figure out pic animation  - ask wachs
    //make a method of customer order here
    //ai will create linked list of ingridients from the classes called order there is going to be 2 types
    //normalOrder and vipOrder - noice
     //player will need to complete them by using buttons in a select time
     //liked list will only check for the size and if the items are all thre in no particular order
     //if all the items are there the player will be rewared mney which will be displayed
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

    public LinkedList<String> anotherOrder(Customer customer){
        LinkedList<String> newOrder = customer.order(doughTypes, cheeseTypes, sauceTypes, toppingTypes);
        return newOrder;
    }
    
   
    
}