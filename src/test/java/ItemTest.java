import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item("Protein Powder", 20.00);
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
    public void canGetSpecialOfferStatus() {
        assertEquals(false, item.getSpecialOfferStatus());
    }

    @Test
    public void canSetOfferStatusToTrue() {
        item.putOnOffer();
        assertEquals(true, item.getSpecialOfferStatus());
    }

    @Test
    public void canSetOfferStatusBackToFalse() {
        item.putOnOffer();
        item.takeOffOffer();
        assertEquals(false, item.getSpecialOfferStatus());
    }

}
