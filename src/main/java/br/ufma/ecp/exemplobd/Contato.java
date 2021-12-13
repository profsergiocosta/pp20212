package br.ufma.ecp.exemplobd;


// POJO Plain Old Java Object

// data class Contato (nome, email, telefone )
// Record
// lombok

public class Contato {
    
    private String nome;
    private String email;
    private String telefone;


    public Contato() {
   
    }
    
    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString (){
        return nome;
    }
    
}
