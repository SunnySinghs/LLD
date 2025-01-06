package Behavioral.Iterator.Impl;

import Behavioral.Iterator.Interface.Iterator;

import java.util.List;

public class BookIterator<E> implements Iterator {
    private List<E> books;
    private int index = 0;

    public BookIterator(List<E> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public E next() {
        if (this.hasNext()) {
            return books.get(index++);
        }
        return null;
    }
}
