/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.LoginVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author 832000223
 */
public class LoginDAO {
    
    public ResultSet autenticarLogin(LoginVO lVO) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            
            String sql = "Select * from login where login=? and senha=?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, lVO.getLogin());
            pstm.setString(2, lVO.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            
//            if(rs.next()){
//                
//            }

            return rs;
            
        } catch (SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(), "Erro! ", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return null;
    }
    
}
