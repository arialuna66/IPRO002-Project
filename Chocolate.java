public class Chocolate extends MenuItem {
    private int id;
    private ChocolateType type;
    private String filling;
    private int cocoaPercentage;

    public Chocolate (int id,String name,double basePrice, String type,String filling) {
        super(name, basePrice);
        this.id = id;
        this.type = type;
        this.filling = filling;
        
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

    public int getId() {
        return id;
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
        return "[" + id + "]" + getName() + " (" + getType() + ")" + getPrice();
    }
    
}