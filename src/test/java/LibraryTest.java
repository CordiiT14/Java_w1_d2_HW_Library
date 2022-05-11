import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("The Poppy War", "R. F. Kuang", "Fantasy");
    }

    @Test
    public void hasEmptyCollection(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void hasBookCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void canAddBookToCollection(){
        library.addBookToCollection(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void collectionIsAtCapacityBookWontAdd(){
        library.addBookToCollection(book1);
        library.addBookToCollection(book1);
        library.addBookToCollection(book1);
        library.addBookToCollection(book1);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canLoanBooks(){
        library.addBookToCollection(book1);
        Book loanedBook = library.loanBook(book1);
        assertEquals(book1, loanedBook);
        assertEquals(0, library.bookCount());
    }
}
