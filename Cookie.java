package projectIPI;

public class Cookie extends DessertItem{
    private int qty;
    double pricePerDozen;

    public double getCost(){
        return this.qty * (this.pricePerDozen/12);
    }
    

}
