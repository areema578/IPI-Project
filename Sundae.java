package projectIPI;

public class Sundae extends IceCream{
    private double priceTopping;
    int qty;
    
    public Sundae() {
        this.priceTopping = 1.00;
        this.qty = 1;
    }
    public Sundae(double priceTopping, int qty) {
        this.priceTopping = priceTopping;
        this.qty = qty;
    }
    public double getCost() {
    
        return getCost() + priceTopping ;
    }
    
}
