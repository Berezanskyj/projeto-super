/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.LoginVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author 832000223
 */
public class LoginDAO {
    
    public ResultSet autenticarLogin(LoginVO lVO) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
    }
    
}
