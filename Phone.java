public class Phone extends Product {
    private String color;


    public Phone(String brand, String model, int price, String operativeSystem, String color) {
        super(brand, model, price, operativeSystem);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product ID: " + getProdId() + "\nBrand: " + getBrand() + "\nModel: " + getModel() + "\nPrice: " + getPrice() + " kr " + "\nOperative System: " + getOperativeSystem() + "\nColor: " + color;
    }
}

