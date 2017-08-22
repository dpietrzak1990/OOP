package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-21.
 */
public class BookAndAuthorTest {
    @Test
    public void authorDefaultGetNameGetEmailGetGender() {
        Author tolkien = new Author("Tolkien", "email", 'm');
        Assert.assertEquals("Tolkien", tolkien.getName());
        Assert.assertEquals("email", tolkien.getEmail());
        Assert.assertEquals(new Character('m'), tolkien.getGender());
    }
    @Test
    public void authorDefaultSetEmail() {
        Author tolkien = new Author("Tolkien", "email", 'm');
        tolkien.setEmail("noweEmail@email.com");
        Assert.assertEquals("noweEmail@email.com", tolkien.getEmail());
    }
    @Test
    public void bookDefaultGetNameGetAuthorGetPrice() {
        Author tolkien = new Author("Tolkien", "email", 'm');
        Book LotR = new Book("LotR", tolkien, 23.99);
        Assert.assertEquals("LotR", LotR.getName());
        Assert.assertEquals(tolkien, LotR.getAuthor());
        Assert.assertEquals(23.99, LotR.getPrice(), 0.01);
    }
    @Test
    public void bookDefaultSetPrice() {
        Author tolkien = new Author("Tolkien", "email", 'm');
        Book LotR = new Book("LotR", tolkien, 23.99);
        LotR.setPrice(12.99);
        Assert.assertEquals(12.99, LotR.getPrice(), 0.01);
    }
    @Test
    public void bookDefaultGetNameGetAuthorGetPriceGetQty() {
        Author tolkien = new Author("Tolkien", "email", 'm');
        Book LotR = new Book("LotR", tolkien, 23.99);
        Assert.assertEquals("LotR", LotR.getName());
        Assert.assertEquals(tolkien, LotR.getAuthor());
        Assert.assertEquals(23.99, LotR.getPrice(), 0.01);
        Assert.assertEquals(50, LotR.getQty());
    }
    @Test
    public void bookDefaultSetQty(){
        Author tolkien = new Author("Tolkien", "email", 'm');
        Book LotR = new Book("LotR", tolkien, 23.99, 50);
        LotR.setQty(35);
        Assert.assertEquals(35, LotR.getQty());
    }
}
