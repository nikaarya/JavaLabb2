import java.util.ArrayList;

public class ProductManagement {

    private static ArrayList<Product> listOfProducts = new ArrayList<>();

    //Add product
    public static void addProducts(Product p) {
        listOfProducts.add(p);
    }

    //Remove product
    public static void removeProduct(int prodId) {
        for (int i = listOfProducts.size() - 1; i >= 0; i--) {
            if (listOfProducts.get(i).getProdId() == prodId) {
                listOfProducts.remove(i);
            }
        }
    }

    //Update product price
    public static void updateProductPrice(int prodId, int price) {
        for (Product p : listOfProducts) {
            if (p.getProdId() == prodId) {
                p.setPrice(price);
            }
        }
    }

    //Update color of a phone
    public static void updatePhoneColor(int prodId, String color) {
        for (Product p : listOfProducts) {
            if (p.getProdId() == prodId) {
                if (p instanceof Phone)
                    ((Phone) p).setColor(color);
            }
        }
    }

    //Update Screen size of a computer
    public static void updateComputerScreenSize(int prodId, int screenSize) {
        for (Product p : listOfProducts) {
            if (p.getProdId() == prodId) {
                if (p instanceof Computer) {
                    ((Computer) p).setScreenSize(screenSize);
                }
            }
        }
    }

    //Print all
    public static void showAllProducts() {
        System.out.println("---ALL PRODUCTS---");
        for (Product p : listOfProducts) {
            System.out.println(p);
            System.out.println("***************");
            System.out.println();
        }
    }

    //Print all phones
    public static void showAllPhones() {
        System.out.println("---ALL PHONES---");
        for (Product p : listOfProducts) {
            if (p instanceof Phone) {
                System.out.println(p);
                System.out.println("***************");
                System.out.println();
            }
        }
    }

    //Print all computers
    public static void showAllComputers() {
        System.out.println("---ALL COMPUTERS---");
        for (Product p : listOfProducts) {
            if (p instanceof Computer) {
                System.out.println(p);
                System.out.println("***************");
                System.out.println();
            }
        }

    }

    //Search for product by ID
    public static void SearchById(int prodId) {
        for (Product p : listOfProducts) {
            if (p.getProdId() == prodId) {
                System.out.println(p);
            }
        }
    }

    //Markera som viktig, boolean
    public static void markAsMostSold(int prodId) {
        for (Product p : listOfProducts) {
            if (p.getProdId() == prodId) {
                p.setMostSold(true);
            }

        }
    }

    //Show bestsellers
    public static void showMostSoldList() {
        System.out.println("***YOUR BESTSELLERS: ***");
        for (Product p : listOfProducts) {
            if (p.isMostSold()) {
                System.out.println(p);
                System.out.println("***************");
                System.out.println();
            }
        }
    }
    public static void mostSoldPhones() {
        System.out.println("***YOUR BESTSELLING PHONES: ***");
        for (Product p : listOfProducts) {
            if (p.isMostSold() && p instanceof Phone) {
                System.out.println(p);
                System.out.println("***************");
                System.out.println();
            }
        }
    }
    public static void removeMostSold(int id) {
      for(Product p : listOfProducts) {
          if (p.isMostSold() && p.getProdId() == id) {
              p.setMostSold(false);
          }


      }
    }
}