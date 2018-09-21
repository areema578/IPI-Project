package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
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