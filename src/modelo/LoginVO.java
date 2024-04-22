/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 832000223
 */
public class LoginVO {
 
    private int idlogin;
    private String login, senha;
    private int perfil;

    public int getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int idlogin) {
        this.perfil = idlogin;
    }
    
    
}
