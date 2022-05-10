import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    @Before
    public void before(){
        library = new Library();
    }

    @Test
    public void hasEmptyCollection(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void hasBookCapacity(){
        assertEquals(5, library.getCapacity());
    }
}
