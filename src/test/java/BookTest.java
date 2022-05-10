import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before(){
        book1 = new Book("The Poppy War", "R. F. Kuang", "Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Poppy War", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("R. F. Kuang", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book1.getGenre());
    }
}
