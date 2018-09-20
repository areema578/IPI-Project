package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */
public class Cookie extends DessertItem{
    private int qty;
    private double pricePerDozen;
    
    public Cookie() {
        qty = 1; //amount of cookies
        pricePerDozen = 3.99; //$ per dz
    }
    
    public Cookie(int qty) {
        this.qty = qty;
    }
    
    public void setCost(double cost) {
    	pricePerDozen = cost; 
    }

    public double getCost(){
        return this.qty * (this.pricePerDozen/12);
    }
    
    public String toString() {
		return name + "\t\t\t\t$" + String.format("%.2f", this.getCost()) + "\n" 
			   + qty + " @ $" + pricePerDozen + " /dz.";	
    }

}