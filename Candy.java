package projectIPI;

public class Candy extends DessertItem{
    double weight;
    private double pricePerPound;
    
    public double getCost(){
        return this.weight * this.pricePerPound;
    }
    
}
