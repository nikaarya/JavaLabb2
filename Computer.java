public class Computer extends Product {
    private double screenSize;

    public Computer(String brand, String model, int price, String operativeSystem, double screenSize) {
        super(brand, model, price, operativeSystem);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Product ID: " + getProdId() + "\nBrand: " + getBrand() + "\nModel: " + getModel() + "\nPrice: " + getPrice() + " kr" + "\nOperative System: " + getOperativeSystem() + "\nScreen Size: " + screenSize + " in.";
    }
}
