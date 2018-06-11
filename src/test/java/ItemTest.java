import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item("Protein Powder", 20.00, 2.00 );
    }

    @Test
    public void canGetName() {
        assertEquals("Protein Powder", item.getName());
    }

    @Test
    public void canGetPrice() {
        assertEquals(20.00, item.getPrice(), 0.01);
    }

    @Test
    public void canGetShippingCost() {
        assertEquals(2.00, item.getShipping(), 0.01);
    }

    @Test
    public void canSetNewName() {
        item.setName("Chocolate Protein Powder");
        assertEquals("Chocolate Protein Powder", item.getName());
    }

    @Test
    public void canSetNewPrice() {
        item.setPrice(25.00);
        assertEquals(25.00, item.getPrice(), 0.01);
    }

    @Test
    public void canSetNewShippingCost() {
        item.setShipping(3.00);
        assertEquals(3.00, item.getShipping(), 0.01);
    }

    @Test
    public void canGetTotalPrice() {
        assertEquals(22.00, item.getTotalPrice(), 0.01);
    }

}
