import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(){
        this.bookCollection = new ArrayList<>();
        this.capacity = 3;
    }

    public int bookCount() {
        return bookCollection.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void addBookToCollection(Book book){
        if(bookCount() < getCapacity()){
            this.bookCollection.add(book);
        }
    }
}
