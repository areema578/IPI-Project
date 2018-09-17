package projectIPI;

public class Cookie extends DessertItem{
    int qty;
    double pricePerDozen;
    
    public Cookie() {
        qty = 1;
        pricePerDozen = 5.00;
    }

    public double getCost(){
        return this.qty * (this.pricePerDozen/12);
    }
    

}
