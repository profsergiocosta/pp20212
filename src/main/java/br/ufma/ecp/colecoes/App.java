package br.ufma.ecp.colecoes;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        MyList<Integer> lista;
        
        
        lista = new MyLinkedList<Integer>();
        //lista = new MyArrayList<Integer>();

        lista.add (10);
        lista.add (20);
        lista.add (30);
        lista.add (90);
        
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            Integer valor = it.next();
            System.out.println(valor);
        }


 
    

/*

        for (Integer valor : lista) {
            System.out.println(valor);
        }

        for (int i=0 ; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }


  
       
        /*
        System.out.println("----------");
        lista.remove(2);
        for (int i=0 ; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
*/
        
    }
}
