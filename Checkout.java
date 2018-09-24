package projectIPI;
import java.util.ArrayList;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and different costs
 */
public class Checkout {
    private static int numberOfItems; // integer number of Items in checkout
    private static double totalCost = 0, totalTax = 0; //total cost of checkout 
    private static double taxRate = .095; //sales tax rate in Los Angeles 
    private static ArrayList<DessertItem> dessertList = new ArrayList<DessertItem>(); // Array list to keep track of different dessertitem objects entered
    
    /**
     * this method enters/adds a DessertItem object into the checkout 
     * @param dItem - the dessertItem object to add to checkout
     */
    public void enterItem(DessertItem dItem) {
        dessertList.add(dItem);
        totalCost += dItem.getCost();
        totalTax = totalCost * taxRate;
        numberOfItems++;
    }
    
    /**
     * this method is used to clear the cash register's checkout 
     */
    public void clearCashRegister() {
        dessertList.clear();
        numberOfItems = 0;
    }
    /**
     * this method gets the total number of items
     * @return - integer of number of items in checkout
     */
    public int getNumberOfItems() {
    	return numberOfItems;
    }
    
    /**
     * this method gets the sub total cost of checkout
     * @return - returns string format of dollar amount of total checkout
     */
    public String getTotalCost() {
        return "$" + String.format("%.2f", totalCost);
    }
    /**
     * this method gets the total tax of checkout
     * @return - returns the string of total tax of checkout
     */
    public String getTotalTax() {
        return "$" + String.format("%.2f", totalTax);
    }
    /**
     * this method gets the total cost with combined with tax.
     * @return - returns string format of checkout total
     */
    public String getTotal() {
    	return "$" + String.format("%.2f", totalCost + totalTax);
    }
    
    
   /**
    * gets string format representing a receipt for the dessert items.
    * @return 
    */
    public String toString() {
    	String receiptItems = "";
        String str = "Number of items: " + numberOfItems + 
        			"\nTotal cost: " + getTotalCost() + 
        			"\nTotal tax: " + getTotalTax() +
                    "\nCost + Tax: " + getTotal() +
                    "\n\nM & M Dessert Shoppe\n--------------------\n";
        
        for (DessertItem item : dessertList) {
        	receiptItems += item;
        }
        
        String receiptTax = String.format("\n%-24s%8s\n", "Tax", getTotalTax());
        String receiptCost = String.format("%-24s%8s\n", "Total Cost", getTotal());
        
        return  str + receiptItems + receiptTax + receiptCost;
        
    }
}