package br.ufma.ecp.colecoes;





public class App {
    public static void main(String[] args) {

        MyList<Integer> lista;
        
        
        //lista = new MyLinkedList<Integer>();
        lista = new MyArrayList<Integer>();

        //lista.add ("joao");
        lista.add (10);
        lista.add (20);
        lista.add (30);

        for (int i=0 ; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        Integer x = (Integer)lista.get(0);
        System.out.println(x);
        /*
        
        System.out.println("----------");
        lista.remove(2);
        for (int i=0 ; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
*/
        
    }
}
