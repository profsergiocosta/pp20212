package br.ufma.ecp.colecoes;

public interface MyList<T> {

    public void add (T e) ;

    public T get (int pos) ;

    public void remove (int pos);

    public int size() ;

}
