/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atores;

/**
 *
 * @author steph
 */
public abstract class Usuario
{
    
    abstract boolean validarLogin(String pass);
    abstract void fazerLogout();
    abstract void abrirInterface();
    public abstract String getLogin();
    public abstract String getNome();
    
    public final boolean fazerLoginTemplate( String login, String senha)
    {
        if ( validarLogin(senha) == true )
        {
                abrirInterface();
                return true;
        }
        else
            return false;
                //invalidarLogin("Senha inválida !!");
            //System.out.println("Senha inválida !!!");
    }
    
}
