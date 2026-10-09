
import java.util.ArrayList;

public class TasteTest {

    private Customer customer;
    private int maximumTastingOptions;

    ArrayList<ChocolateType> triedOnes = new ArrayList<ChocolateType>();

    public TasteTest(Customer customer) {
        this.customer = customer;
        if (customer.isVip()) {
            maximumTastingOptions = ChocolateType.values().length;
        } else {
            maximumTastingOptions = 2;
        }
    }

    public int getMaximumTastingOptions() {
        return maximumTastingOptions;
    }

    public boolean hasTried() {
        return triedOnes.size() < maximumTastingOptions;
    }

    public void tasting(ChocolateType type) {
        if (hasTried()) {
            triedOnes.add(type);
            System.out.println(customer.getName() + " is tasting " + type + " chocolate, please enjoy!");
        } else {
            System.out.println("Your tasting options are running out of limit. Become our VIP member to try more chocolate types!!");
        }
    }

    @Override
    public String toString() {
        return customer.getName() + "tried " + triedOnes.size() + "types: " + triedOnes;
    }

}
