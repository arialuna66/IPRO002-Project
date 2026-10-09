
public class ChocoMe {

    public static void main(String[] args) {
        ChocolateShop shop = new ChocolateShop();
        boolean opening = true;

        while (opening) {
            showmenu();
            int choice = In.nextInt();

            if (choice == 1) {
                shop.addCustomer();
            } else if (choice == 2) {
                shop.TasteTest();
            } else if (choice == 3) {
                shop.viewVipBeans();
            } else if (choice == 4) {
                shop.browseChocolates();
            } else if (choice == 5) {
                shop.makeOrder();
            } else if (choice == 6) {
                shop.generateReport();
            } else if (choice == 0) {
                opening = false;
            } else {
                System.out.println("Only select the number from 0 to 6 please!!");
            }
        }

        System.out.println();
        System.out.println("Thank you for visting ChocoMe! Welcome back anytime to make your swwetest chocie");

    }

    public static void showmenu() {
        System.out.println();
        System.out.println("------- Welcome to ChocoMe -------");
        System.out.println("1. Add Customer (walk-in / VIP member");
        System.out.println("2. Have taste test");
        System.out.println("3. View VIP-only cocoa bean list");
        System.out.println("4. Browse chocolate list");
        System.out.println("5. Create customized order");
        System.out.println("6. Generate ordering report");
        System.out.println("0. Exit");
        System.out.println("Choose the option from 0 to 6.");
    }

}
