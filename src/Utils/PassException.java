package Utils;

import business.model.Usuario;

public class PassException extends Exception {

    public PassException(String e) {
        super(e);
    } 
   
    public PassException(Usuario usuario, String e){
        super("Usuario: " + usuario.getLogin() + "\nError: " + e);
    }
}
