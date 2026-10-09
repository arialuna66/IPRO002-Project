public interface Price {
    double getPrice();
}

class MenuItem implements Price {
    private String name;
    private double basePrice;

    public MenuItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return name + " ($" + basePrice + ")";
    }
}