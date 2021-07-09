/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import atores.Usuario;

/**
 *
 * @author steph
 */
public interface ControladorLoginInterface
{
    void efetuarLogin(String login, String senha);
    boolean procurarUsuario(String login);
}
