public class CocoaBean {
    private int ID;
    private String name;
    private String supplyCountry;
    private int cocoaPercentage;
    private boolean vipOnly;


    public CocoaBean(int ID,String name, String supplyCountry,int cocoaPercentage) {
        this.ID = ID;
        this.name = name;
        this.supplyCountry = supplyCountry;
        this.cocoaPercentage =cocoaPercentage;
        this.vipOnly = vipOnly;
    }

    public String getName() {
        return name;
    }

    public String getSupplyCountry() {
        return supplyCountry;
    }

    public int getID() {
        return ID;
    }
    public int getCocoaPercentage() {
        return cocoaPercentage;
    }
    public boolean vipOnly() {
        return vipOnly;
    }

    
    
@Override
public String toString() {
    return name + "from" + supplyCountry + "(" + cocoaPercentage + "%)";
}

}
