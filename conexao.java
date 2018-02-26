package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexao {
    public static Connection AbrirConexao(){
        Connection con = null;
        try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost/petshop";
                con = DriverManager.getConnection(url, "root", "eeep"); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro na conexao com o banco");   
        }
        return con;
    }
    public static void FecharConexao(Connection con){
        try{
            con.close();
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
    }
}
