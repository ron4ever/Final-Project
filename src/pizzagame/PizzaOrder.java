package pizzagame;
import collections.LinkedList;
/**
 * interface enforcing the rules of a PizzaOrder
 * @Since 30-May-2019
 * @Instructor Mr.Wachs
 * @author r.stuchevsky
 */
public interface PizzaOrder {
    //properties of a pizza order
     //endings to add to the Strings to specify types
    final String dough = "Dough"; 
    final String cheese = "Cheese";
    final String topping = "Topping";
    final String sauce = "Sauce";
    //Arrays of the ingridients so they can be easily ocnverted to a linkedList at once instead of using the Add method 20 times in a row
    final String[] doughs ={"FullGrain " + dough,"Thick " 
            + dough,"Thin " + dough,"Soft " + dough,"Italian " + dough,"Cheese Fill " + dough};
    final String[] cheeses = {
        "Mozzarela " + cheese,"Swiss " + cheese,"Old-Fort " + cheese,
        "Cheddar " + cheese,"Provolone " + cheese,"Parmesan " + cheese};
    final String[] toppings ={"Peperoni " + topping,"Ham " + topping,"Salami " + topping,"Pineapple " + topping,
        "Mushrooms "+ topping,"Peppers "+ topping};
    final String[] sauces ={"Italian " +sauce,"Home-Made " +sauce,"American " +sauce,"Spicy "+sauce,
        "Louisana "+sauce,"Chipotle "+sauce};
    //The conversion of the Arrays to LinkedList for easier handling by the Customer order method
    LinkedList<String> doughTypes = new LinkedList<>(doughs);
    LinkedList<String> toppingTypes = new LinkedList<>(toppings);
    LinkedList<String> cheeseTypes = new LinkedList<>(cheeses);
    LinkedList<String> sauceTypes = new LinkedList<>(sauces);  
}
