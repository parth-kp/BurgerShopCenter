package Burgers;

public class AlooTikkiBurger {
    private double basePrice;
    private double finalPrice=0.0;
    private String name;

    private String addition1="";
    private double addition1Price=0.0;

    private String addition2="";
    private double addition2Price=0.0;

    private String addition3="";
    private double addition3Price=0.0;

    private String addition4="";
    private double addition4Price=0.0;


    public AlooTikkiBurger() {
        this("Aloo Tikki Burger", 60.00);
    }

    public AlooTikkiBurger(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    void addition1(String extra, double price) {
        this.addition1 = extra;
        this.addition1Price = price;
    }

    void addition2(String extra, double price) {
        this.addition2 = extra;
        this.addition2Price = price;
    }

    void addition3(String extra, double price) {
        this.addition3 = extra;
        this.addition3Price = price;
    }

    void addition4(String extra, double price) {
        this.addition4 = extra;
        this.addition4Price = price;
    }

    String getAdditionName(int id){
        return switch (id) {
            case 201 -> "Extra Cheese";
            case 202 -> "Extra Tikki";
            case 203 -> "Extra Veggies";
            case 204 -> "Extra Mayonnaise";
            case 205 -> "Extra Periperi";
            default -> "";
        };
    }

    Double getAdditionPrice(int id){
        return switch (id) {
            case 201, 203 -> 30.00;
            case 205, 204 -> 25.00;
            case 202 -> 35.00;
            default -> 0.00;
        };
    }

    public void setAdditional1(int id){
        addition1(getAdditionName(id),getAdditionPrice(id));
    }
    public void setAdditional2(int id){
        addition2(getAdditionName(id),getAdditionPrice(id));
    }
    public void setAdditional3(int id){
        addition3(getAdditionName(id),getAdditionPrice(id));
    }
    public void setAdditional4(int id){
        addition4(getAdditionName(id),getAdditionPrice(id));
    }

    public String getName() {
        return name;
    }
}
