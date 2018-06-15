import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Item> items;

    public ShoppingBasket(){
        this.items = new ArrayList();
    }

    public ArrayList getItems() {
        return items;
    }

    public int countBasket() {
        return items.size();
    }

    public void addItem(Item itemToAdd) {
        items.add(itemToAdd);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void emptyBasket() {
        items.clear();
    }

    public double totalBasketPriceExShipping() {
        double totalPriceExShipping = 0;
        for (Item item : items){
            totalPriceExShipping += item.getPrice();
        }
        return totalPriceExShipping;
    }

    public double totalShippingPrice() {
        double totalShippingPrice = 0;
        for (Item item : items) {
            totalShippingPrice += item.getShipping();
        }
        return totalShippingPrice;
    }

    public double totalPrice() {
        double totalPrice = totalShippingPrice() + totalBasketPriceExShipping();
        return totalPrice;
    }
}
