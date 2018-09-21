package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and differents costs
 */
public class Sundae extends IceCream{
    private double toppingCost = 0.65;
    
    public Sundae() {
    }
    
    public void setToppingCost(double toppingCost) {
    	this.toppingCost = toppingCost;
    }
    
    public double getCost() {
        return cost + toppingCost;
    }
    
    public String toString() {
    	String cost = "$" + String.format("%.2f", this.getCost());
    	return String.format("%-48s%6s\n", name, cost);
    }
    
}