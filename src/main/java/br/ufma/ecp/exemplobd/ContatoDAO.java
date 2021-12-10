package br.ufma.ecp.exemplobd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ContatoDAO {

    private Connection conn;

    public ContatoDAO (Connection conn) {
        this.conn = conn;
    }

    // metodos CRUD
    public void create (Contato contato) {
            String sql = "INSERT INTO contato(nome,email,telefone) VALUES(?,?, ?)";
            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, contato.getNome());
                stmt.setString(2, contato.getEmail());
                stmt.setString(3, contato.getTelefone());
                stmt.execute();
                stmt.close();
                System.out.println("inserido");
            } catch (SQLException u) {
                throw new RuntimeException(u);
            }
    }


    public List<Contato> retrive () {
        String sql = "select * from contato";
        List<Contato> contatos = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Contato contato = new Contato();
                contato.setEmail(rs.getString("email"));
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contatos.add(contato);
            }
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return contatos;
    }
    
}
