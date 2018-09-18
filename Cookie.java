package projectIPI;

/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */

public class Cookie extends DessertItem{
    int qty;
    double pricePerDozen;
    
    public Cookie() {
        qty = 1;
        pricePerDozen = 1.00;
    }
    
    public Cookie(double pricePerDozen, int qty ) {
        this.qty = qty;
        this.pricePerDozen = pricePerDozen;
    }

    public double getCost(){
        return this.qty * (this.pricePerDozen/12);
    }
    

}