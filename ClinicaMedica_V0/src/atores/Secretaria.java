/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atores;
import interfaces.InterfaceSecretaria;
import javax.swing.ImageIcon;

/**
 *
 * @author steph
 */
public class Secretaria extends Usuario
{
    String login;
    String senha;
    String nome;
    String matricula;
    ImageIcon foto;
    InterfaceSecretaria telaSecretaria;

    public Secretaria(String login, String senha, String nome, String matricula, String caminhoFoto) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.matricula = matricula;
        this.foto = new javax.swing.ImageIcon(getClass().getResource(caminhoFoto));
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
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
        
    @Override
    boolean validarLogin(String pass)
    {
        if ( this.getSenha().equals(pass) ) 
            return true;
        else
            return false;
    }



    @Override
    void fazerLogout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void abrirInterface()
    {
        telaSecretaria = new InterfaceSecretaria(this);
        telaSecretaria.setVisible(true);
    }
    
}
