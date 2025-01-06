package Behavioral.Iterator;

import Behavioral.Iterator.Impl.Library;
import Behavioral.Iterator.Interface.Iterator;
import Behavioral.Iterator.Model.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("A", 100));
        books.add(new Book("B", 200));
        books.add(new Book("C", 300));

        Library library = new Library(books);
        Iterator<Book> itr = library.createIterator();
        while (itr.hasNext()) {
            Book obj = itr.next();
            System.out.println(obj.getName() + " : " + obj.getPrice());
        }
    }
}
