package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */
public class Cookie extends DessertItem{
    private int qty = 1;
    private double pricePerDozen = 3.99;
    
    public Cookie() {
    }
    
    public Cookie(int qty) {
        this.qty = qty;
    }
    
    public void setCost(double cost) {
    	pricePerDozen = cost; 
    }

    public double getCost(){
        return (qty * (pricePerDozen / 12));
    }
    
    public String toString() {
		return name + "\t\t\t\t$" + String.format("%.2f", this.getCost()) + "\n" 
			   + qty + " @ $" + pricePerDozen + " /dz.\n";	
    }

}