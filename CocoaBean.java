public class CocoaBean {
    private String name;
    private String origin;
    private String farm;
    private String flavourNotes;
    private String cocoaPercentage;

    public CocoaBean(String name, String origin, String farm,String flavourNotes, int cocoaPercentage) {
        this.name = name;
        this.orgin = origin;
        this.farm = farm;
        this.flavourNotes = flavourNotes;
        this.cocoaPercentage =cocoaPercentage;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getFarm() {
        return farm;
    }

    public String getFlavourNotes() {
        return flavourNotes;
    }

    
@Override
public String toString() {
    return name + "from" + origin + "(" + farm + ")" + flavourNotes;
}

}
