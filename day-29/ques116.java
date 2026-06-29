//ques116. write a program to create inventory management system
import java.util.*;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double getTotalValue() {
        return quantity * price;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }
}

public class ques116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Quantity");
            System.out.println("5. Remove Product");
            System.out.println("6. Total Inventory Value");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    products.add(new Product(id, name, quantity, price));
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    if (products.isEmpty()) {
                        System.out.println("No products available.");
                    } else {
                        for (Product p : products) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter product ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Product p : products) {
                        if (p.id == searchId) {
                            System.out.println("Product found: " + p);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter product ID to update: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;
                    for (Product p : products) {
                        if (p.id == updateId) {
                            System.out.print("Enter new quantity: ");
                            p.quantity = sc.nextInt();
                            System.out.println("Quantity updated successfully.");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter product ID to remove: ");
                    int removeId = sc.nextInt();
                    Iterator<Product> it = products.iterator();
                    boolean removed = false;
                    while (it.hasNext()) {
                        if (it.next().id == removeId) {
                            it.remove();
                            System.out.println("Product removed successfully.");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 6:
                    double totalValue = 0;
                    for (Product p : products) {
                        totalValue += p.getTotalValue();
                    }
                    System.out.println("Total Inventory Value = " + totalValue);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        sc.close();
    }
}