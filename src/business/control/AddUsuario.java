package business.control;

import static business.control.Validacao.validaUsuario;
import business.model.Usuario;
import java.util.HashMap;

public class AddUsuario implements Command{
    
    MementoCareTaker caretaker;
    
    @Override
    public HashMap<String, Usuario> executa(Usuario u, HashMap<String, Usuario> usuarios) throws LoginException, PassException {
        if(validaUsuario(u))
            usuarios.put(u.getLogin(), u);
        caretaker.addMemento(new UsuarioMemento(usuarios));
        return usuarios;
    }
}
