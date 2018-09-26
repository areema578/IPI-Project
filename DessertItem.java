package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and different costs
 */
public abstract class DessertItem implements Comparable{
  protected String name;
  protected int calories;

/**
 * Null constructor for DessertItem class
 */
  public DessertItem() {
    name = "";
  }
  
/**
 * Initializes DessertItem data
 */
  public DessertItem(String name) {
      this.name = name;
  }
  
  /**
   * Sets the dessert item's name
   * @param name - name as a String
   */
  public void setName(String name) {
	  this.name = name;
  }
  
/**
 * Returns name of DessertItem
 * @return name of DessertItem
 */
  public final String getName() {
    return name;
  }
  
/**
 * Returns cost of DessertItem
 * @return cost of DessertItem
 */
  public abstract double getCost();
  /**
   * Calculates and returns the amount of Calories of Dessert Item
   * @return amount of calories in integer form
   */
  
  public abstract int getCalories();

  /**
   * Compares the cost of the dessert item
   * @param otherItem - the other DessertItem object you are comparing
   * @return - the dessert item that costs more
   */
  @Override
  public int compareTo(Object otherItem) {
	  DessertItem item = (DessertItem)otherItem;
	  if(this.getCost() > item.getCost()) {
		  return 1;
	  }else if(this.getCost() < item.getCost()) {
		  return -1;
	  }else {
		  return 0;
	  }
  }
  
  /**
   * Uses compareTo method to determine which object has the bigger cost
   * @param item1 - DessertItem object
   * @param item2 - DessertItem object
   * @return the DessertItem that costs more
   */
  public static DessertItem max(DessertItem item1, DessertItem item2) {
	  if(item1.compareTo(item2) > 0) {
		  return item1; //item1 costs more
	  }else if(item1.compareTo(item2) < 0) {
		  return item2; //item2 costs more
	  }else {
		  return item1; //same cost so doesn't matter
	  }
  }
  
  public String toString() {
	return name;
  }
  
}
