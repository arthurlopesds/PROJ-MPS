package business.control;

import static business.control.Validacao.validaUsuario;
import java.util.*;
import business.model.Usuario;
import infra.Persistencia;

public class UsuarioControl {

    Persistencia p = new Persistencia();
    HashMap<String, Usuario> usuarios;
    MementoCareTaker caretaker;

    public void insereMapa(Usuario u) throws LoginException, PassException {
        if(validaUsuario(u))
            usuarios.put(u.getLogin(), u);
        caretaker.addMemento(new UsuarioMemento(usuarios));
    }

    public void editaMapa(String key, Usuario u) throws LoginException, PassException{
        if(validaUsuario(u))
            usuarios.put(key, u);
    }

    public void removMapa(String s) {
        if (usuarios.containsKey(s)) {
            usuarios.remove(s);
        } else {
            System.out.println("O Usuário não foi encontrado.");
        }
        HashMap<String,Usuario> estado = usuarios;
        caretaker.addMemento(new UsuarioMemento(estado));
    }

    public static void printUsuario(Map m) {
        Iterator<Map.Entry<Integer, Usuario>> hm = m.entrySet().iterator();
        while (hm.hasNext()) {
            Usuario usuario = hm.next().getValue();
            System.out.println("Login: " + usuario.getLogin() + "Senha: " + usuario.getSenha());
        }
    }
    
    public void desfazer(){
        usuarios = caretaker.getUltimoEstadoSalvo().getEstadoSalvo();
    }
}
