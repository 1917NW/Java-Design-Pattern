import pattern.BookSelf;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        BookSelf bookSelf = new BookSelf();
        bookSelf.addBook("Book 1");
        bookSelf.addBook("Book 2");
        bookSelf.addBook("Book 3");

        Iterator iterator = bookSelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
