package br.ufma.ecp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> lista = new LinkedList<>();
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(70);
        
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            Integer valor = it.next();
            System.out.println(valor);
        }

        /*
        for (Integer valor : lista) {
            System.out.println(valor);
        }
        */

       /*
        for (int i=0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        */
    }
}
