
package pizzagame;

import collections.LinkedList;

/**
 *
 * @author r.stuchevsky
 */
public interface PizzaOrder {
  final String dough = "Dough";
    final String cheese = "Cheese";
    final String topping = "Topping";
    final String sauce = "Sauce";
    final String[] doughs ={"FullGrain " + dough,"Thick " 
            + dough,"Thin " + dough,"Soft " + dough,"Italian " + dough,"Cheese Fill " + dough};
    final String[] cheeses = {
        "Mozzarela " + cheese,"Swiss " + cheese,"Old-Fort " + cheese,
        "Cheddar " + cheese,"Provolone " + cheese,"Parmigian " + cheese};
    final String[] toppings ={"Peperoni " + topping,"Ham " + topping,"Salami " + topping,"Pineapple " + topping,
        "Mushrooms "+ topping,"Peppers "+ topping};
    final String[] sauces ={"Italian " +sauce,"Home-Made " +sauce,"American " +sauce,"Spicy "+sauce,
        "Louisana "+sauce,"Chipotle "+sauce};
    LinkedList<String> doughTypes = new LinkedList<>(doughs);
    LinkedList<String> toppingTypes = new LinkedList<>(toppings);
    LinkedList<String> cheeseTypes = new LinkedList<>(cheeses);
    LinkedList<String> sauceTypes = new LinkedList<>(sauces); 
    
}
