public class Chocolate extends MenuLitem {
    private ChocolateType type;
    private String filling;
    private int cocoaPercentage;

    public Chocolate (String name,double basePrice, String filling) {
        super(name, basePrice);
        this.type = type;
        this.filling = filling;
        this.cocoaPercentage = cocoaPercentage;
    }

    public ChocolateType getType() {
        return type;
    }
    
    public String getFilling() {
        return filling;
    }
    
    public int getCocoaPercentage() {
        return cocoaPercentage;
    }
    @Override
    public double getPrice() {
        double price = getBasePrice();
        if (type == ChocolateType.DARK) {
            price = price + cocoaPercentage * 0.02;
        } else if (type == ChocolateType.ALCOHOLIC) {
            price = price + 1.50;
        } else if (type == ChocolateType.BLONDE) {
            price = price + 0.80;
        }
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + getType() + ")" + getPrice();
    }
}
