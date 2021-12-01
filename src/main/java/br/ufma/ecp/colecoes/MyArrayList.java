package br.ufma.ecp.colecoes;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    
    private Object[] elementos;
    private int max = 2;
    private int top = 0;

    public MyArrayList () {
        elementos = new Object[max];
    }

    public void add (T e) {
        
        if (top >= max) {
            max = max * 2;
            Object[] aux = new Object[max];
            for (int i=0 ; i < size() ;i++) {
                aux[i] = elementos[i];
            } 
            elementos = aux;
        }

        elementos[top++] = e;
    }

    public T get (int pos) {
        return (T)elementos[pos];
    }

    public void remove (int pos) {
        for (int i= pos ; i < size()-1 ; i++) {
            elementos[i] = elementos[i+1];
        }
        top--;
    }

    public int size() {
        return top;
    }

    @Override
    public Iterator<T> iterator() {
 
        return new MyArrayListIterator(this);
    }
    
}
