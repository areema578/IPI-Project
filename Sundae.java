package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and different costs
 */
public class Sundae extends IceCream{
    private double toppingCost = 0.65;// double cost per topping
    
    /**
     * this is the default constructor 
     * with default cost of topping at 65 cents
     */
    public Sundae() {
    }
    /**
     * this is an overloading constructor with specified qty and name
     * @param qty - integer number of toppings
     * @param name - string of the name of topping purchased
     */
    public Sundae(int qty, String name) {
    	this.qty = qty;
    	this.name = name;
    }
    /**
     * this method sets the price per of the topping.
     * @param toppingCost- the cost of each topping in dollar amount. 
     */
    public void setToppingCost(double toppingCost) {
    	this.toppingCost = toppingCost;
    }
    /**
     * this method simply caluates the cost of toppings and returns it as a double
     * @return cost -cost of toppings combined 
     */
    public double getCost() {
        return ((qty * cost) + toppingCost);
    }
    /**
     * this is the toString method to print all Sundae information onto checkout receipt
     */
    public String toString() {
    	String cost = "$" + String.format("%.2f", this.getCost());
    	return String.format("%-48s%6s\n", name, cost);
    }
    
}