import java.util.ArrayList;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Chocolate> menu = new ArrayList<Chocolate>();
        menu.add(new Chocolate(101,"Gianduja",4.50,ChocolateType.DARK,"None"));
    
        ArrayList<Chocolate>picked = new ArrayList<Chocolate>();
        int id = -1;
        Scanner scanner = new Scanner(System.in);
        while (id !=0) {
            for(int i=0;i<menu.size();i++) {
                System.out.println(menu.get(i));
            }
            System.out.println("Enter chocolate ID:");
            id = scanner.nextInt();
        
            if (id != 0) {
        Chocolate found = null;
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getId() == id) {
                found = menu.get(i);
            }
        }
        if (found != null) {
            picked.add(found);
            System.out.println("Added: " + found.getName());
        } else {
            System.out.println("No chocolate with ID " + id);
        }
        }
    }
        
    }
}
