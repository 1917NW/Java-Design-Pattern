package pattern;

import java.util.Iterator;

public class BookSelfIterator implements Iterator {
    private BookSelf bookSelf;
    private int index;

    public BookSelfIterator(BookSelf bookSelf) {
        this.bookSelf = bookSelf;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < bookSelf.getBooks().size();
    }

    @Override
    public Object next() {
        return bookSelf.getBooks().get(index++);
    }
}
