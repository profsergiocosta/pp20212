package br.ufma.ecp.exemplobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {


    public static void criarTabela (Connection conn) {
            String sql = "CREATE TABLE contato2( " +
            "email varchar(30), telefone int, " +
            "nome varchar(30) )";

            PreparedStatement stmt;
            try {
                stmt = conn.prepareStatement(sql);
                stmt.execute();
                stmt.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
     
    }

    public static void insere (Connection conn, String nome, String email, String telefone) {
            //String sql = "INSERT INTO contato(nome,email, telefone) VALUES(?,?, ?)";
            //String sql = "INSERT INTO contato(nome,email, telefone) VALUES('joao','joao@gmail.com','123456')";
            String sql = "INSERT INTO contato(nome,email, telefone) VALUES('"
                + nome + "','" + email + "'," + telefone + ")";

            try {
                Statement stmt = conn.createStatement(); //conn.prepareStatement(sql);
               // stmt.setString(1, "sergio");
                //stmt.setString(2, "skosta@gmail.com");
                //stmt.setString(3, "123");
                stmt.execute(sql);
                stmt.close();
                System.out.println("inserido");
            } catch (SQLException u) {
            throw new RuntimeException(u);
            }
    }


    public static void insereSeguro (Connection conn, String nome, String email, String telefone) {
            String sql = "INSERT INTO contato(nome,email, telefone) VALUES(?,?, ?)";

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, nome);
                stmt.setString(2, email);
                stmt.setString(3, telefone);
                stmt.execute();
                stmt.close();
                System.out.println("inserido");
            } catch (SQLException u) {
            throw new RuntimeException(u);
            }
    }

    public static void imprime (Connection conn) {
        String sql = "select * from contato";
        try {
        PreparedStatement stmt = conn.prepareStatement(sql);
        System.out.println(stmt);
        ResultSet rs = stmt.executeQuery();
        System.out.println(rs);
        while (rs.next()) {
            System.out.println("Nome:"+rs.getString("nome"));
            System.out.println("Email:"+rs.getString("email"));
        }
        stmt.close();
        } catch (SQLException u) {
        throw new RuntimeException(u);
        }
    }

    public static void main(String[] args) {
        Connection conn;
        String url = "jdbc:derby:agenda;create=true";
        try {
            conn = DriverManager.getConnection(url);
            System.out.println(conn);
            System.out.println("Conexão aberta com sucesso"); 
           // criarTabela(conn); 
            insere(conn, "maria", "maria@gmail.com", "select count(*) from contato2");
            //imprime(conn);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

       
    }
}
