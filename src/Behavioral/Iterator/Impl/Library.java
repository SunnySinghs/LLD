package Behavioral.Iterator.Impl;

import Behavioral.Iterator.Interface.Aggregate;
import Behavioral.Iterator.Interface.Iterator;

import java.util.List;

public class Library<E> implements Aggregate {

    private List<E> books;

    public Library(List<E> books) {
        this.books = books;
    }
    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
