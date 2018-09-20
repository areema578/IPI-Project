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
    
    public String toString() {
		return name + "\t\t\t$" + String.format("%.2f", this.getCost()) + "\n" 
			   + String.format("%.2f", weight) + " lbs. @ $" + pricePerPound + " /lb.\n";
    }
}