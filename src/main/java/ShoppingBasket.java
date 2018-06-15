import java.util.ArrayList;
import java.util.Collections;

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

    public double totalPrice() {
        double totalPrice = 0;
        for (Item item : items){
            if (Collections.frequency(items, item) > 1){
                totalPrice += item.getPrice() / 2;
            }
            else {
                totalPrice += item.getPrice();
            }
        }
        return totalPrice;
    }

}
