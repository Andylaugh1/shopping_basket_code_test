import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Item item1, item2, item3;

    @Before
    public void before() {

        item1 = new Item("Protein Powder", 20.00, 2.00);
        item2 = new Item("Charger", 10.00, 1.00);
        item3 = new Item("Think and Grow Rich", 6.00, 2.00);
        shoppingBasket = new ShoppingBasket();
    }

    @Test
    public void canAddAnItem() {
        shoppingBasket.addItem(item1);
        assertEquals(1, shoppingBasket.countBasket());
    }

    @Test
    public void canGetItems() {
        assertEquals(Arrays.asList(item1, item2, item3), shoppingBasket.getItems());
    }
}
