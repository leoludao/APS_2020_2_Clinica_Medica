/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import atores.Usuario;
import interfaces.InterfaceLogin;
import java.util.ArrayList;

/**
 *
 * @author steph
 */
public class ControladorLogin implements ControladorLoginInterface
{
    InterfaceLogin telaLogin;
    ArrayList usus = new ArrayList();
    Usuario atual;

     
    public ControladorLogin() {
        this.telaLogin = new InterfaceLogin(this);
        
    }

    public InterfaceLogin getTelaLogin() {
        return telaLogin;
    }


    
    @Override
    public boolean procurarUsuario(String login)
    {
        Usuario sonda;
        for ( int i = 0; i < this.usus.size(); i++)
        {
            sonda = (Usuario) usus.get(i);
            if ( sonda.getLogin().equals(login) )
            {
                this.atual = (Usuario) sonda;
                System.out.println("Usuário encontrado. Seu nome é " + sonda.getNome() + " !!!");
                return true;
            }

        }       
        return false;
    }

    
    @Override
    public void efetuarLogin(String login, String senha)
    {
        if ( procurarUsuario(login) == true )
        {
            if ( this.atual.fazerLoginTemplate(login, senha) == true )
            {
                telaLogin.fechar();
            }
            else
            {
                telaLogin.mostrarMsg("Senha Incorreta !!!");
            }
        }
        else
            telaLogin.mostrarMsg("Usuário não encontrado !!!");

        //System.out.println("Usuário nao encontrado !!!");
    }
    
    public void addUsuario( Usuario usu)
    {
        usus.add(usu);
    }
    
}
