package projectIPI;

public class IceCream extends DessertItem{
    double pricePer;
    int qty;
    
    public IceCream() {
        this.pricePer = 1;
        this.qty =1;
    }
    
    public IceCream(double pricePer, int qty) {
        this.pricePer = pricePer;
        this.qty = qty;
    } 
    
    public double getCost() {
        return (this.pricePer * this.qty);
    }

}
