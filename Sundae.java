package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */
public class Sundae extends IceCream{
    private double priceTopping;
    int qty;
    
    public Sundae() {
        priceTopping = 1.00;
        qty = 1;
    }
    public Sundae(double priceTopping, int qty) {
        this.priceTopping = priceTopping;
        this.qty = qty;
    }
    public double getCost() {
    
        return getCost() + priceTopping ;
    }
    
}