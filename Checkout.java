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
    private static int numberOfItems;
    private static double totalCost = 0, totalTax = 0;
    private static double taxRate = .095;
    private static ArrayList<DessertItem> dessertList = new ArrayList<DessertItem>();
    
    
    public void enterItem(DessertItem d) {
        dessertList.add(d);
        totalCost += d.getCost();
        totalTax = totalCost * taxRate;
        numberOfItems++;
    }
    
    public void clearCashRegister() {
        dessertList.clear();
        numberOfItems = 0;
    }
    
    public int getNumberOfItems() {
    	return numberOfItems;
    }
    
    public String getTotalCost() {
        return String.format("%.2f", totalCost);
    }
    
    public String getTotalTax() {
        return String.format("%.2f", totalTax);
    }
    
    public String getTotal() {
    	return String.format("%.2f", totalCost + totalTax);
    }
    
    
   /**
    * gets string format representing a receipt for the dessert items.
    * @return 
    */
    public String toString() {
    	String receiptItems = "";
        String str = "Number of items: " + numberOfItems + 
        			"\nTotal cost: $" + getTotalCost() + 
        			"\nTotal tax: $" + getTotalTax() +
                    "Cost + Tax: $" + getTotal() +
                    "\n\nM & M Dessert Shoppe\n";
        
        for (DessertItem item : dessertList) {
        	receiptItems += item;
        }
        
        return  str + receiptItems;
        
    }
}