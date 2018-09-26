package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and different costs
 */
public class Cookie extends DessertItem{
    private int qty = 1; // qty of Cookies bought
    private double pricePerDozen = 3.99; // price per dozen of cookies 
    private int caloriesPerDozen = 142;
    
    
    /**
     * constructor for default constructor with qty of 1 cookie at 3.99 each
     */
    public Cookie() {
    }
    /**
     * constructor of cookie with specified qty of cookies bought
     * @param qty - integer of how many cookies bought
     */
    public Cookie(int qty) {
        this.qty = qty;
    }
    /**
     * this method sets the cost of cookies per dozen
     * @param cost - double of the cost of the cookies per dozen
     */
    public void setCost(double cost) {
    	pricePerDozen = cost; 
    }
    /**
     * this method calculates and gets the total cost of cookies purchased
     */
    public double getCost(){
        return (qty * (pricePerDozen / 12));
    }
    

    /**
     * this method calculates and gets the total calories of cookies purchased
     * @return - the integer amount of total calories
     */
    public int getCalories() {
    	return(qty * (caloriesPerDozen/12));
    }
    
    /**
     * this method sets the qty of cookies purchased
     * @param qty - the integer amount of cookies purchased.
     */
    public void setQty(int qty) {
    	this.qty = qty;
    }
    /**
     * this is the toString method to printing out 
     * Cookie purchase information on the receipt.
     */
    public String toString() {
    	String cost = "$" + String.format("%.2f", this.getCost());
    	return String.format("%1d @ %.2f /dz.\n%-24s%8s\n", qty, pricePerDozen,name, cost);	
    }

}