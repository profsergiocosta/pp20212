package br.ufma.ecp.exemplobd;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.Action;
import javax.swing.JButton;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;  


public class FrameContato extends JFrame {

    private JTextField txtNome;
    private JTextField txtEmail;

    String url = "jdbc:mysql://localhost:3306/agenda?user=sergio&password=1234";
    Connection conn;
    ContatoDAO dao;

    public FrameContato (String titulo) {
        super(titulo);

        try {
            conn = DriverManager.getConnection(url);
            dao = new ContatoDAO(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        setSize (400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

        setLayout(new FlowLayout());

        JPanel panelNome = new JPanel();
        panelNome.setLayout(new FlowLayout());
        panelNome.add (new JLabel("Nome:"));
        txtNome = new JTextField(15);
        panelNome.add(txtNome);
        add(panelNome);


        JPanel panelEmail = new JPanel();
        panelEmail.setLayout(new FlowLayout());
        panelEmail.add (new JLabel("Email:"));
        txtEmail = new JTextField(15);
        panelEmail.add(txtEmail);
        add(panelEmail);


        JPanel panelButtons = new JPanel();

        JButton btnCad = new JButton("Cadastrar");
        btnCad.addActionListener( (ev) -> cadastrar() );

        JButton btnClose = new JButton("Fechar");

         // interfaces funcionais, são interfaces que possui apenas um metodo abstrato

        btnClose.addActionListener( (ev) ->  System.exit(0) );

        panelButtons.add(btnCad);
        panelButtons.add(btnClose);


        add(panelButtons);

    }

    private void cadastrar () {
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        System.out.println(nome);
        System.out.println(email);
        Contato contato = new Contato (nome, email, "122");
        dao.create(contato);
        System.out.println(contato);
        System.out.println("cadastrando");
    }
    
}
