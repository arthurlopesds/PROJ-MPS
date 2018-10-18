package mapas;

import mapas.negocios.modelo.Usuario;
import java.util.Comparator;

public class CompararNome implements Comparator<Usuario> {
    @Override
    public int compare(Usuario o1, Usuario o2) {
        int retorno = o1.getLogin().compareTo(o2.getLogin());
        if (retorno == 0){
            return o1.getSenha().compareTo(o2.getSenha());
        
        }
        return retorno;
    }
}
