package br.ufma.ecp.colecoes;

import java.util.Iterator;

public class MyLinkedListIterator<T> implements Iterator<T> {

    private MyLinkedList<T>.Node current;

    public MyLinkedListIterator(MyLinkedList<T>.Node current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        
        return current != null;
    }

    @Override
    public T next() {
        T element = current.element;
        current = current.next;
        return element;
    }
    
}
