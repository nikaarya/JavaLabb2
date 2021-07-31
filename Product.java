public abstract class Product {

    private boolean mostSold = false;
    static int idCounter = 1;

    private int prodId;
    private String brand;
    private String model;
    private int price;
    private String operativeSystem;


    public Product(String brand, String model, int price, String operativeSystem) {
        this.prodId = idCounter;
        idCounter++;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.operativeSystem = operativeSystem;
    }

    public int getProdId() {
        return prodId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOperativeSystem() {
        return operativeSystem;
    }

    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }

    public boolean isMostSold() {
        return mostSold;
    }

    public void setMostSold(boolean mostSold) {
        this.mostSold = mostSold;
    }

    @Override
    public String toString() {
        return "Product ID: " + prodId + "\nBrand: " + brand + "\nModel: " + model + "\nPrice: " + price + " kr" + "\nOperative System: " + operativeSystem;
    }
}

