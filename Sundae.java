package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */
public class Sundae extends IceCream{
    private double toppingCost;
    
    public Sundae() {
        toppingCost = 0.65;
    }
    
    public void setToppingCost(double toppingCost) {
    	this.toppingCost = toppingCost;
    }
    
    public double getCost() {
        return cost + toppingCost;
    }
    
    public String toString() {
    	return name + "\t\t\t\t$" + String.format("%.2f", this.getCost());
    }
    
}