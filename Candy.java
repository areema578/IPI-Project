package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - To order desserts and to print out the receipt
 * Inputs: Dessert selections
 * Output: Dessert receipt displaying all items and differents costs
 */
public class Candy extends DessertItem{
    private double weight = 1.00;
    private double pricePerPound = 0.89;
    
    public Candy(){
    }
    public Candy(double weight){
        this.weight = weight;
    }
    public Candy(double weight, String name){
        this.weight = weight;
        this.name = name;
    }
    
    public void setCost(double cost) {
    	pricePerPound = cost; 
    }
    
    public double getCost(){
        return (weight * pricePerPound);
    }
    
    public void setWeight(double weight) {
    	this.weight = weight;
    }
    
    //"%-36s%3d(@%1s)%8s"
    public String toString() {
    	String cost = "$" + String.format("%.2f", this.getCost());
    	String weightString = String.format("%.2f", weight);
    	return String.format("%1s lbs. @ %.2f /lb.\n%-24s%8s\n", weightString, pricePerPound,name, cost);
    }
}