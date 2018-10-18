package business.control;

import static business.control.validacao.validaUsuario;
import java.util.*;
import business.model.Usuario;
import infra.Persistencia;

public class UsuarioControl {

    Persistencia p = new Persistencia();
    HashMap<String, Usuario> usuarios;

    public void insereMapa(Usuario u) throws LoginException, PassException {
        if(validaUsuario(u))
            usuarios.put(u.getLogin(), u);
    }

    public void editaMapa(String key, Usuario u) throws LoginException, PassException{
        /* Buscar pela chave, e alterar o usuário
        Set<String> kyes = usuarios.keySet();
        for (String chave : kyes) {
            if (chave == key) {
                
            }
        }
        */
        if(validaUsuario(u))
            usuarios.put(key, u);
    }

    public void removMapa(String s) {
        if (usuarios.containsKey(s)) {
            usuarios.remove(s);
        } else {
            System.out.println("O Usuário não foi encontrado.");
        }
    }

    public static void printUsuario(Map m) {
        Iterator<Map.Entry<Integer, Usuario>> hm = m.entrySet().iterator();
        while (hm.hasNext()) {
            Usuario usuario = hm.next().getValue();
            System.out.println("Login: " + usuario.getLogin() + "Senha: " + usuario.getSenha());
        }
    }
}
