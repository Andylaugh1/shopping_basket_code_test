import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList items;

    public ShoppingBasket(){
        this.items = new ArrayList();
    }

    public ArrayList getItems() {
        return items;
    }

    public int countBasket() {
        return items.size();
    }


}
