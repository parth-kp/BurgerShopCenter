package Burgers;

public class CheesePaneerBurger extends AlooTikkiBurger{
    public CheesePaneerBurger() {
        super("Cheese Paneer Burger", 100.00);
        super.addition1("Extra Cheese",0.0);
        super.addition2("Paneer", 0.0);
    }

    public CheesePaneerBurger(String name, double basePrice) {
        super(name, basePrice);
        super.addition1("Extra Cheese",0.0);
        super.addition2("Paneer", 0.0);
    }


}
