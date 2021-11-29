package br.ufma.ecp.colecoes;

public class MyLinkedList<T> implements MyList<T> {
    

    private class Node {
        public T element;
        public Node next;

        public Node (T e, Node n) {
            element = e;
            next = n;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    public MyLinkedList () {
       
    }

    public void add (T e) {
      if (first == null) {
          first = new Node(e,null);
          last = first;
      } else {
          last.next = new Node(e,null);
          last = last.next;
      }
      size++;
    }

    public T get (int pos) {
        Node aux = first;
        for (int i= 0; i < pos; i++) {
            aux = aux.next;
        }
        return aux.element;
    }

    public void remove (int pos) {
        Node aux = first;
        // tratando do caso que o elemento não é nem o primeiro e nem o ultimo
        for (int i = 0; i < pos-1; i++) {
            aux = aux.next;
        }
        aux.next = aux.next.next;
        size--;
    }

    public int size() {
        return size;
    }
}
