
import java.util.ArrayList;
import java.util.Collections;

public class ChocolateShop {

    ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    ArrayList<Order> orders = new ArrayList<Order>();
    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<CocoaBean> beans = new ArrayList<CocoaBean>();
    ArrayList<TasteTest> tasteTests = new ArrayList<TasteTest>();

    public ChocolateShop() {
        products();
    }

    private void products() {
        Chocolate milkHazelnutBar = new Chocolate("Milk Hazelnut Bar", 9.5, ChocolateType.MILK, "Hazelnut", 35);
        menuItems.add(milkHazelnutBar);
        Chocolate darkSeaSaltBar = new Chocolate("Dark Sea Salt Bar", 12.0, ChocolateType.DARK, "None", 70);
        menuItems.add(darkSeaSaltBar);
        Chocolate whiteBerryBar = new Chocolate("White Berry Bar", 10.5, ChocolateType.WHITE, "Strawberry", 28);
        menuItems.add(whiteBerryBar);
        Chocolate liqueurTruffleBox = new Chocolate("Liqueur Truffle Box", 16.0, ChocolateType.ALCOHOLIC, "Liqueur", 40);
        menuItems.add(liqueurTruffleBox);

        CocoaBean criolloBean = new CocoaBean(1, "Criollo", "Venezuela", 80, true);
        beans.add(criolloBean);
        CocoaBean forasteroBean = new CocoaBean(2, "Forastero", "Ghana", 55, false);
        beans.add(forasteroBean);
        CocoaBean trinitarioBean = new CocoaBean(3, "Trinitario", "Madagascar", 70, true);
        beans.add(trinitarioBean);

    }

    public void addCustomer() {
        System.out.println();
        System.out.println("------- Add New Customer -------");
        System.out.println("Type in your NAME: ");
        String name = In.nextLine();

        System.out.println("------- Select Customer Type -------");
        System.out.println("1. Walk-in Customer");
        System.out.println("2. VIP Member");
        int type = In.nextInt();

        CustomerType customerType = null;
        if (type == 1) {
            customerType = CustomerType.WALK_IN;
        } else if (type == 2) {
            customerType = CustomerType.VIP;
        } else {
            System.out.println("Unproper input. Retry it once again.");
        }

        String customerID = "A" + (customers.size() + 1);
        Customer customer = new Customer(customerID, name, customerType);
        customers.add(customer);

        System.out.println();
        System.out.println("Successfully Added! Welcome to the big ChocoMe family, " + name + "!!");
        System.out.println("You Customer ID is: " + customerID);
        if (customerType == CustomerType.VIP) {
            System.out.println("You are a VIP member now! Enjoy your special benefits!");
            System.out.println("ChocoMe Benefits for you: " + customer.getBenefits());
        } else {
            System.out.println("You are a walk-in customer. Enjoy your visit!");
        }

    }

    public void TasteTest() {
        System.out.println();
        System.out.println("------- Taste Test -------");
        System.out.println("Available Taste Tests:");

    }

}
