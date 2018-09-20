package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */
public class IceCream extends DessertItem{
    protected double cost;
    
    public IceCream() { //only has cost
        cost = 1.50;
    }
    
    public void setCost(double cost) {
    	this.cost = cost;
    }
    
    public double getCost() {
        return this.cost;
    }
    
    public String toString() {
    	return name + "\t\t\t\t$" + String.format("%.2f", this.getCost());
    }

}