package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and differents costs
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
    	String cost = "$" + String.format("%.2f", this.getCost());
    	return String.format("%1d @ %.2f /dz.\n%-24s%8s\n", qty, pricePerDozen, name, cost);	
    }

}