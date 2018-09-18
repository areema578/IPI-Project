package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */
public class IceCream extends DessertItem{
    double pricePer;
    int qty;
    
    public IceCream() {
        pricePer = 1;
        qty =1;
    }
    
    public IceCream(double pricePer, int qty) {
        this.pricePer = pricePer;
        this.qty = qty;
    } 
    
    public double getCost() {
        return (this.pricePer * this.qty);
    }

}