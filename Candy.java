/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and different costs
 */
package projectIPI;

public class Candy extends DessertItem{
    private double weight = 1.00; // weight of candy defaulted to 1.00 lb
    private double pricePerPound = 0.89; // price per lb of candy.
    private int caloriesPerLb = 1064; //calorie per lb of candy
    
    /**
     * candy constructor with default weight and price Per pound
     */
    public Candy(){
    }
    /**
     * Overloaded Candy constructor with specific weight
     * @param weight  weight specified.
     */
    public Candy(double weight){
        this.weight = weight;
    }
    /**
     * Overloaded Candy Constructor with specific weight and name 
     * @param weight  the weight of the candy 
     * @param name  the name of the candy
     */
    public Candy(double weight, String name){
        this.weight = weight;
        this.name = name;
    }
    
    /**
     * this is a setter method used to set the cost per lb of candy.
     * Could be used by store manager to change prices.
     * @param cost  price per lb to set candy to.
     */
    public void setCost(double cost) {
    	pricePerPound = cost; 
    }
    
    /**
     * this method is used to get the total cost of candy
     */
    public double getCost(){
        return (weight * pricePerPound);
    }
    
    /**
     * this method is for setting the weight of the purchase of candy
     * @param weight  weight of candy in lbs
     */
    public void setWeight(double weight) {
    	this.weight = weight;
    }
    /**
     * this method calculates the total calories of candy purchased
     * @return the total amount of calories in an integer
     */
    public int getCalories() {
    	return (int)(caloriesPerLb * weight);
    }
    
    /**
     * toString method to print out 
     * all information on candy purchase.
     */
    public String toString() {
    	String cost = "$" + String.format("%.2f", this.getCost());
    	String weightString = String.format("%.2f", weight);
    	return String.format("%1s lbs. @ %.2f /lb.\n%-24s%8s\n", weightString, pricePerPound,name, cost);
    }
}