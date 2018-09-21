package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and differents costs
 */
public class IceCream extends DessertItem{
    protected double cost = 1.50;
    private int qty = 1;
    
    public IceCream() {
    }
    
    public IceCream(int qty, String name) {
    	this.qty = qty;
    	this.name = name;
    }
    
    public void setCost(double cost) {
    	this.cost = cost;
    }
    
    public double getCost() {
        return this.cost * qty;
    }
    
    public String toString() {
    	String cost = "$" + String.format("%.2f", this.getCost());
    	return String.format("%-24s%8s\n", name, cost);
    }

}