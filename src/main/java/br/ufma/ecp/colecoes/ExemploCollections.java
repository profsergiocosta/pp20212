package br.ufma.ecp.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploCollections {
    public static void main(String[] args) {
        // lista
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(10);
        lista.add(40);
        for (Integer v : lista) {
            System.out.println(v);
        }
        System.out.println("------------");

        //Set<Integer> conjunto = new HashSet<>();
        Set<Integer> conjunto = new TreeSet<>();
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(10);
        conjunto.add(40);
        for (Integer v : conjunto) {
            System.out.println(v);
        }

        System.out.println("------------ pessoas ----");
        
        Set<Pessoa> conjunto2 = new HashSet<>();
        conjunto2.add(new Pessoa("Maria"));
        conjunto2.add(new Pessoa("Joao"));
        conjunto2.add(new Pessoa("Maria"));
        conjunto2.add(new Pessoa("Jose"));
        for (Pessoa v : conjunto2) {
            System.out.println(v);
        }
        Object p1 = new Pessoa("Maria");
        Object p2 = new Pessoa("Maria");
        System.out.println(p1.equals(p2));

        System.out.println(p1.equals(10));
        

    }
}
