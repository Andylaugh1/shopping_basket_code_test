import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Item item1, item2, item3;

    @Before
    public void before() {

        item1 = new Item("Protein Powder", 20.00);
        item2 = new Item("Charger", 10.00);
        item3 = new Item("Think and Grow Rich", 6.00);
        shoppingBasket = new ShoppingBasket();
        item3.putOnOffer();

        shoppingBasket.addItem(item1);
    }

    @Test
    public void canCountItemsInBasket() {
        assertEquals(1, shoppingBasket.countBasket());
    }

    @Test
    public void canAddAnItem() {
        shoppingBasket.addItem(item2);
        assertEquals(2, shoppingBasket.countBasket());
    }

    @Test
    public void canAddTwoOfSameItem() {
        shoppingBasket.addItem(item2);
        shoppingBasket.addItem(item2);
        assertEquals(3, shoppingBasket.countBasket());
    }


    @Test
    public void canGetItems() {
        shoppingBasket.addItem(item2);
        shoppingBasket.addItem(item2);
        assertEquals(Arrays.asList(item1, item2, item2), shoppingBasket.getItems());
    }

    @Test
    public void canRemoveAnItem() {
        shoppingBasket.removeItem(item1);
        assertEquals(0, shoppingBasket.countBasket());
    }

    @Test
    public void canClearShoppingBasket() {
        shoppingBasket.addItem(item2);
        shoppingBasket.addItem(item3);
        shoppingBasket.emptyBasket();
        assertEquals(0, shoppingBasket.countBasket());
    }

    @Test
    public void calculateTotalBasketPrice() {
        shoppingBasket.addItem(item2);
        assertEquals(30.00, shoppingBasket.totalPrice(), 0.01);
    }

    @Test
    public void calculateTotalBasketPriceIfItemOnBuyOneGetOneFree(){
        shoppingBasket.addItem(item3);
        assertEquals(3, shoppingBasket.countBasket());
        assertEquals(Arrays.asList(item1, item3, item3), shoppingBasket.getItems());
        assertEquals(26.00, shoppingBasket.totalPrice(), 0.01);
    }

    @Test
    public void canAddTwoBuyOneGetOneFreeItems(){
        shoppingBasket.addItem(item3);
        shoppingBasket.addItem(item3);
        assertEquals(5, shoppingBasket.countBasket());
        assertEquals(32, shoppingBasket.totalPrice(), 0.01);
    }


}
