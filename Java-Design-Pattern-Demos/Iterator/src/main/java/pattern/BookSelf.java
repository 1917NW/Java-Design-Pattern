package pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookSelf implements Iterable{
    List<String> books = new ArrayList<>();
    @Override
    public Iterator iterator() {
        return new BookSelfIterator(this);
    }

    public List<String> getBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }
}
