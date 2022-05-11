import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int countBooks(){
        return this.collection.size();
    }

    public void addBookToCollection(Book book){
        this.collection.add(book);
    }
}
