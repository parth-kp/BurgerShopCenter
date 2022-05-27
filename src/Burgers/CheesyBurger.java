package Burgers;

public class CheesyBurger extends AlooTikkiBurger{
    public CheesyBurger() {
        super("Cheesy Burger", 90.00);
        super.addition1("Extra Cheese",0.0);
    }
    public CheesyBurger(String name, double basePrice) {
        super(name, basePrice);
        super.addition1("Extra Cheese",0.0);
    }
}
