package business.control;

import java.util.*;
import business.model.Usuario;
import infra.Persistencia;

public class UsuarioControl {

    Command command;
    HashMap<String, Usuario> usuarios;
    Persistencia p = new Persistencia();
    MementoCareTaker caretaker;
    
    public void executeCommand(Usuario u, Command command) throws LoginException, PassException{
        usuarios = command.executa(u, usuarios);
    }
    
    public void desfazer(){
        usuarios = caretaker.getUltimoEstadoSalvo().getEstadoSalvo();
    }
    
    public UsuarioControl(){
        caretaker = new MementoCareTaker();
        caretaker.addMemento(new UsuarioMemento(usuarios));
    }
    
    public static void printUsuario(Map m) {
        Iterator<Map.Entry<Integer, Usuario>> hm = m.entrySet().iterator();
        while (hm.hasNext()) {
            Usuario usuario = hm.next().getValue();
            System.out.println("Login: " + usuario.getLogin() + "Senha: " + usuario.getSenha());
        }
    }
}
