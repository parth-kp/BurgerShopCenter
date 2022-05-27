package Burgers;

public class BadaCombo extends CheesyBurger{

    private String extraAddition1="";
    private double extraAddition1Price=0.0;

    private String extraAddition2="";
    private double extraAddition2Price=0.0;

    public BadaCombo() {
        super("Bada Combo", 140.00);
        super.addition2("French Fries",0.0);
        super.addition3("Coke", 0.0);
    }
}
