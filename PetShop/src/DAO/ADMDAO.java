package DAO;

import java.sql.*;
import Modelo.ADM;

public class ADMDAO extends ExecuteSQL{
    
    public ADMDAO (Connection con){
        super (con);
    }
    
    public boolean Logar(String login_adm, String senha_adm, int tipo){
        boolean finalR = false;
        try {
            String consulta = "select login_adm, senha_adm, tipo from adm"
                    +"where login_adm = '"+ login_adm +"' and senha_adm = '"+ senha_adm +"' and tipo = '"+ tipo+"'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while(rs.next()){
                    ADM adm = new ADM();
                    adm.setLogin_adm(rs.getString(1));
                    adm.setSenha_adm(rs.getString(2));
                    adm.setTipo(0);
                    finalR = true;
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return finalR;
    }
}
