public class Item {

    private String name;
    private double price;
    private boolean isOnSpecialOffer;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
        this.isOnSpecialOffer = false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        if (isOnSpecialOffer) {
            return price / 2;
        }
        return price;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }


    public boolean getSpecialOfferStatus() {
        return isOnSpecialOffer;
    }

    public void putOnOffer() {
        isOnSpecialOffer = true;
    }

    public void takeOffOffer() {
        if(isOnSpecialOffer == true){
            isOnSpecialOffer = false;
        }
    }
}
