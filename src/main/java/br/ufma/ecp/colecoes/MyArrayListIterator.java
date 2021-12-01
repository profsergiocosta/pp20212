package br.ufma.ecp.colecoes;

import java.util.Iterator;

public class MyArrayListIterator<T> implements Iterator<T> {

    private int currentPos = 0;
    private MyArrayList<T> mylist;

    public MyArrayListIterator(MyArrayList<T> myArrayList) {
        mylist = myArrayList;
    }

    @Override
    public boolean hasNext() {
    
        return currentPos < mylist.size();
    }

    @Override
    public T next() {
     
        return mylist.get(currentPos++);
    }
    
}
