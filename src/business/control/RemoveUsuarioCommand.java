package business.control;

import business.model.Usuario;
import java.util.HashMap;

public class RemoveUsuarioCommand implements Command{
    MementoCareTaker caretaker;
    
    @Override
    public HashMap<String, Usuario> executa(Usuario u, HashMap<String, Usuario> usuarios) throws LoginException, PassException {
        if (usuarios.containsKey(u.getLogin()))
            usuarios.remove(u.getLogin());
        else
            System.out.println("O Usuário não foi encontrado.");
   
        HashMap<String,Usuario> estado = usuarios;
        caretaker.addMemento(new UsuarioMemento(estado));
        
        return usuarios;
    }
}
