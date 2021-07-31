import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static boolean exit = false;

    public static void main(String[] args) {

//        Phone p1 = new Phone("Apple", "iPhone 11 Pro", 13000, "iOS", "White");
//        ProductManagement.addProducts(p1);
//
//        Phone p2 = new Phone("Samsung", "Note20", 12000, "Android", "Blue");
//        ProductManagement.addProducts(p2);
//
//        Computer c1 = new Computer("HP", "Chromebook", 3000, "Windows", 12);
//        ProductManagement.addProducts(c1);
//
//        Computer c2 = new Computer("Apple", "MacBook Air", 15000, "Mac OS", 13);
//        ProductManagement.addProducts(c2);

        menu();

    }

    private static void menu() {

        while (!exit) {
            System.out.println("=====What do you want to do?=====");
            System.out.println("\n--------------------------");
            System.out.println("0. Exit");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Update product price");
            System.out.println("4. Update color of phone");
            System.out.println("5. Update computer screen size");
            System.out.println("6. Show all products");
            System.out.println("7. Show all phones");
            System.out.println("8. Show all computers");
            System.out.println("9. Search for products by ID");
            System.out.println("10. Add product to the list of bestsellers");
            System.out.println("11. Show bestsellers");
            System.out.println("12. Show bestselling phones");
            System.out.println("13. Remove product from bestselling list");
            System.out.println("--------------------------");


            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    exit = true;
                    System.out.println("Terminating program...");
                    break;
                case 1:
                    add();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    priceUpdate();
                    break;
                case 4:
                    colorUpdate();
                    break;
                case 5:
                    screenSizeUpdate();
                    break;
                case 6:
                    printAll();
                    break;
                case 7:
                    printPhones();
                    break;
                case 8:
                    printComputers();
                    break;
                case 9:
                    IdSearch();
                    break;
                case 10:
                    markAsBestseller();
                    break;
                case 11:
                    printBestsellers();
                    break;
                case 12:
                    printBestsellingPhones();
                    break;
                case 13:
                    removeBestseller();
                    break;
                default:
                    System.out.println("Try again. Enter a number between 0-11");
                    break;
            }
        }
    }

    private static void add() {
        System.out.println("Do you want to add a phone or a computer?");
        String pick = sc.nextLine();
        if (pick.equalsIgnoreCase("phone")) {
            addPhone();
        } else if (pick.equalsIgnoreCase("computer")) {
            addComputer();
        } else {
            System.out.println("Invalid choice");
            add();
        }
    }

    private static void addPhone() {

        System.out.print("Enter brand: ");
        String inputBrand = sc.nextLine();

        System.out.print("Enter model: ");
        String inputModel = sc.nextLine();

        int inputPrice = readInt("Enter price: ");

        System.out.print("Enter operative system: ");
        String inputOperativeSystem = sc.nextLine();

        System.out.print("Enter color: ");
        String inputColor = sc.nextLine();

        Product p = new Phone(inputBrand, inputModel, inputPrice, inputOperativeSystem, inputColor);

        System.out.println("\n--------------------------");
        System.out.println("New phone: ");
        System.out.println(p);
        System.out.println("--------------------------\n");

        ProductManagement.addProducts(p);
    }

    private static void addComputer() {
        System.out.print("Enter brand: ");
        String inputBrand = sc.nextLine();

        System.out.print("Enter model: ");
        String inputModel = sc.nextLine();

        int inputPrice = readInt("Enter price: ");

        System.out.print("Enter operative system: ");
        String inputOperativeSystem = sc.nextLine();

        double inputScreenSize = readInt("Enter screen size (inches): ");

        Product c = new Computer(inputBrand, inputModel, inputPrice, inputOperativeSystem, inputScreenSize);

        System.out.println("\n--------------------------");
        System.out.println("New computer: ");
        System.out.println(c);
        System.out.println("--------------------------\n");


        ProductManagement.addProducts(c);
    }

    private static void removeProduct() {
        int inputId = readInt("Enter product ID of the item you want to remove: ");

        System.out.println("\nRemoving item with product ID " + inputId + "...");
        System.out.println();
        ProductManagement.removeProduct(inputId);
    }

    private static void priceUpdate() {
        int updatePrice = readInt("Enter product ID of the item you want a price update on: ");

        int newPrice = readInt("Enter the new price of the product: ");
        ProductManagement.updateProductPrice(updatePrice, newPrice);

        System.out.println();
        System.out.println("The price of product " + updatePrice + " is now " + newPrice + " kr.");
    }

    private static void colorUpdate() {

        int inputId = readInt("Enter ID of the phone: ");

        System.out.print("Enter the new color of the phone: ");
        String newColor = sc.nextLine();

        ProductManagement.updatePhoneColor(inputId, newColor);
        System.out.println();
        System.out.println("The color of the phone with ID " + inputId + " is now changed to " + newColor + ".");
    }

    private static void screenSizeUpdate() {
        int inputId = readInt("Enter ID of the computer: ");

        int newScreenSize = readInt("Enter the new screen size: ");

        ProductManagement.updateComputerScreenSize(inputId, newScreenSize);
        System.out.println();
        System.out.println("The computer with ID " + inputId + " is now changed to " + newScreenSize + " in.");
    }

    private static void printAll() {
        ProductManagement.showAllProducts();
    }

    private static void printPhones() {
        ProductManagement.showAllPhones();
    }

    private static void printComputers() {
        ProductManagement.showAllComputers();
    }

    private static void IdSearch() {
        int inputId = readInt("Enter product ID of the product you're searching for: ");
        System.out.println();
        ProductManagement.SearchById(inputId);
    }

    private static void markAsBestseller() {
        int enterId = readInt("Enter product ID of the item you want to add to the bestseller list: ");
        ProductManagement.markAsMostSold(enterId);

        System.out.println("\nProduct with ID " + enterId + " is added to bestsellers.");
    }

    private static void printBestsellers() {
        ProductManagement.showMostSoldList();
    }

    private static void printBestsellingPhones() {
        ProductManagement.mostSoldPhones();
    }

    private static void removeBestseller() {
        int inputId = readInt("Enter ID of the product you want to remove from the bestselling list: ");
        ProductManagement.removeMostSold(inputId);
        System.out.println("\nRemoving item with product ID " + inputId);
    }

    private static int readInt(String question) {
        int num = 0;
        boolean loop = true;

        while (loop) {
            try {
                System.out.print(question);
                num = sc.nextInt();
                loop = false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input, try again");
            }
            sc.nextLine();
        }
        return num;
    }
}

