package DAO;

import java.sql.*;
import Modelo.Secretario;

public class SecretarioDAO extends ExecuteSQL{
    
    public SecretarioDAO(Connection con){
        super (con)   ;
    }
    
    public boolean Logar(String login_sec, String senha_sec, int tipo){
        boolean finalR = false;
        try {
            String Consulta = "select login_sec, senha_sec, tipo from secretario"+"where login_sec = '"+ login_sec +"' and senha_sec = '"+ senha_sec +"' and tipo = '"+ tipo+"'";
            PreparedStatement ps = getCon().prepareStatement(Consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while(rs.next()){
                    Secretario sec = new Secretario();
                    sec.setLogin_sec(rs.getString(1));
                    sec.setSenha_sec(rs.getString(2));
                    sec.setTipo(0);
                    finalR = true;
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return finalR;
    }
}
