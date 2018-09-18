package projectIPI;
import java.util.ArrayList;

/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */

public class Checkout {
    static int numberOfItems;
    double totalCost = 0, totalTax = 0;
    double taxRate = .095;
    double total = totalCost + totalTax;
    static ArrayList<DessertItem> dessertList = new ArrayList<DessertItem>();
    
    
    public void enterItem(DessertItem d) {
        dessertList.add(d);
        this.numberOfItems++;
    }
    
    public void clearCashRegister() {
        dessertList.clear();
        this.numberOfItems = 0;
    }
    
    public double getTotalCost() {
        for (DessertItem d : dessertList) {
            this.totalCost += d.getCost();
        }
        
        return this.totalCost;
    }
    public double getTotalTax() {
        this.totalTax = getTotalCost() * taxRate;
        
        return this.totalTax;
    }
    
    
   /**
    * gets string format representing a receipt for the dessert items.
    * @return 
    */
    public String toString() {
        
        String str = "Number of items: " + numberOfItems + "\n" +
                    "Toal cost: " + totalCost + "\nTotal tax: " + totalTax +
                "Cost + Tax: " + total;
        
        
        
        
        return  str;
        
    }
}