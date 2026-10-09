
public class Customer implements Discountable {

    private String customerID;
    private String name;
    private CustomerType customerType;
    private int points;
    private String benefits;

    public Customer(String customerID, String name, CustomerType customerType) {
        this.customerID = customerID;
        this.name = name;
        this.customerType = customerType;
        this.points = 0;
        if (customerType == CustomerType.VIP) {
            this.benefits = "SPECIAL BENEFITS!! YOU CAN ENJOY 10% DISCOUNT, VIP-ONLY COCOA BEANS and ALL TASTE OPTIONS!!";
        } else {
            this.benefits = "Original Price with 2 options on tasting.";
        }
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public int getPoints() {
        return points;
    }

    public String getBenefits() {
        return benefits;
    }

    public boolean isVip() {
        return customerType == CustomerType.VIP;
    }

    public void pointsAddition() {
        if (customerType == CustomerType.VIP) {
            points = points + 10;
        }
    }

    @Override
    public double calculateDiscountedPrice() {
        if (isVip()) {
            return 0.9;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return customerID + "  " + name + " (" + customerType + ", points left: " + points + ")";
    }

}
