package br.ufma.ecp.exemplobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class App {

  //      Connection conn;
        //String ur        Connection conn;
        //String url = "jdbc:derby:agenda;create=true";
    //String url = "jdbc:mysql://localhost:3306/agenda?user=sergio&password=1234";
//        String url = "jdbc:mysql://localhost:3306/agenda?user=sergio&password=1234";

   
    public static void main(String[] args) {
        
        FrameContato frame = new FrameContato("Ola Mundo");


        frame.setVisible(true);
    }
}
