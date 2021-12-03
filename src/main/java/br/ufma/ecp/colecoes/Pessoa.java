package br.ufma.ecp.colecoes;

public class Pessoa {
    private String nome ;
    
    public Pessoa (String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals (Object other) {
        if (other instanceof Pessoa) {
            Pessoa p = (Pessoa)other;
            return nome.equals (p.getNome());
        }
        return false;
    }

    @Override
    public int hashCode () {
        return nome.hashCode();
    }

}
