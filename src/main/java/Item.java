public class Item {

    private String name;
    private double price;
    private double shipping;

    public Item(String name, double price, double shipping){
        this.name = name;
        this.price = price;
        this.shipping = shipping;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getShipping() {
        return shipping;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void setShipping(double newShippingCost) {
        this.shipping = newShippingCost;
    }

    public double getTotalPrice() {
        return price + shipping;
    }
}
