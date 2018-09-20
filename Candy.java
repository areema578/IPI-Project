package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */
public class Candy extends DessertItem{
    private double weight = 1.00;
    private double pricePerPound = 0.89;
    
    public Candy(){
    }
    
    public Candy(double weight){
        this.weight = weight;
    }
    
    public void setCost(double cost) {
    	pricePerPound = cost; 
    }
    
    public double getCost(){
        return (weight * pricePerPound);
    }
    
    //"%-36s%3d(@%1s)%8s"
    public String toString() {
    	String cost = "$" + String.format("%.2f", this.getCost());
		return name + String.format("%-36s", cost) + "\n" 
			   + String.format("%.2f", weight) + " lbs. @ $" + pricePerPound + " /lb.\n";
    }
}