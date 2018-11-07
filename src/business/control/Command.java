package business.control;

import business.model.Usuario;
import java.util.HashMap;

public interface Command {
    public HashMap<String, Usuario> executa(Usuario u, HashMap<String, Usuario> usuarios) throws LoginException, PassException;
}
