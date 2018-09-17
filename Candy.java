package projectIPI;

public class Candy extends DessertItem{
    double weight;
    double pricePerPound;
    
    public Candy(){
        this.weight = 1;
        this.pricePerPound = 1;
    }
    
    public Candy( double weight, double pricePerPound){
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }
    public double getCost(){
        return this.weight * this.pricePerPound;
    }
    
}
