package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and different costs
 */
public class IceCream extends DessertItem{
    protected double cost = 1.50; // cost per icecream 
    protected int calories = 137;
    
    /**
     * default constructor with cost set to 1.50 and qty set to 1.
     */
    public IceCream() {
    }
    /**
     * constructor with qty of icecream and icecream name specified.
     * @param qty - integer qty of ice cream bought
     * @param name - name/type of icecream purchased
     */
    public IceCream(String name) {
    	this.name = name;
    }
    /**
     * this method sets the cost per ice cream
     * @param cost - double price per ice cream
     */
    public void setCost(double cost) {
    	this.cost = cost;
    }
    /**
     * this method calculates and gets the cost of icecream bought
     */
    public double getCost() {
        return this.cost;
    }
    /**
     * this method gets the total calories of ice cream purchased
     * @return - calories- integer number of calories of ice cream order
     */
    public int getCalories() {
    	return calories;
    }
    /**
     * this is a toString method for the ice cream line on the checkout receipt
     */
    public String toString() {
    	String cost = "$" + String.format("%.2f", this.getCost());
    	return String.format("%-24s%8s\n", name, cost);
    }

}