package business.control;
import business.model.Usuario;

public class LoginException extends Exception{
    
    public LoginException(String e){
        super(e);
    }
    
    public LoginException(Usuario usuario, String e){
        super("Usuario: " + usuario.getLogin() + "\nError: " + e);
    }
}
