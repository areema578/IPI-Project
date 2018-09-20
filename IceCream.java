package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */
public class IceCream extends DessertItem{
    protected double cost = 1.50;
    
    public IceCream() {
    }
    
    public void setCost(double cost) {
    	this.cost = cost;
    }
    
    public double getCost() {
        return this.cost;
    }
    
    public String toString() {
    	String cost = "$" + String.format("%.2f", this.getCost());
    	return name + String.format("%-36s", cost) + "\n";
    }

}