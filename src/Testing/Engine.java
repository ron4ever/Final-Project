/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing;

/**
 * Engine.java -
 * 
 * @since 6-May-2019 
 * @author r.stuchevsky
 */
public class Engine{
     
     public Engine() {
        // linked list oculd help
        Customer customer = new Customer();
        customer.order(); // customer rolls the order
        VIP vip = new VIP();
        vip.order();
       
     } //ai will create linked list of ingridients from the classes
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