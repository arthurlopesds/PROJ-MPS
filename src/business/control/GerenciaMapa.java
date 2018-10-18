package business.control;

import java.util.*;
import business.model.Usuario;
import util.Persistencia;

public class GerenciaMapa {

    Persistencia p = new Persistencia();

    public void insereMapa(Map m, Usuario u) {
        m.put(u.getLogin(), u);
    }

    public void editaMapa(Map m, String key, Usuario u) {
        m.put(key, u);
    }

    public void removMapa(Map m, String s) {
        if (m.containsKey(s)) {
            m.remove(s);
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
