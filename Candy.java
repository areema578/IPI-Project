package projectIPI;
/**	
 * Scott Arima and Howard Chen
 * 18 Sep 2018
 * Purpose of the program - 
 * Inputs: 
 * Output: 
 */
public class Candy extends DessertItem{
    private double weight;
    private double pricePerPound;
    
    public Candy(){
        weight = 1; //lbs
        pricePerPound = 0.89; //$ per lbs
    }
    
    public Candy(double weight){
        this.weight = weight;
    }
    
    public void setCost(double cost) {
    	pricePerPound = cost; 
    }
    
    public double getCost(){
        return this.weight * this.pricePerPound;
    }
    
    public String toString() {
		return name + "\t\t\t\t$" + String.format("%.2f", this.getCost()) + "\n" 
			   + weight + "lbs. @ $" + pricePerPound + " /lb.";
    }
}