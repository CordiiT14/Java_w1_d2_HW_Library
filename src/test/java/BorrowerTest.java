import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library();
        book1 = new Book("The Poppy War", "R. F. Kuang", "Fantasy");
        library.addBookToCollection(book1);
    }

    @Test
    public void hasEmptyCollection(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canBorrowABookFromLibrary(){
        Book loanedBook = library.loanBook(book1);
        borrower.addBookToCollection(loanedBook);
        assertEquals(1, borrower.countBooks());
    }
}
