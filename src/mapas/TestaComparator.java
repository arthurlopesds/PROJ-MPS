package mapas;

import business.model.Usuario;
import java.util.*;

public class TestaComparator implements Comparator<Usuario> {

    @Override
    public int compare(Usuario o1, Usuario o2) {
        int retorno = o1.getLogin().compareTo(o2.getLogin());
        if (retorno == 0) {
            return o1.getSenha().compareTo(o2.getSenha());
        }
        return retorno;
    }

    public static void main(String[] args) {
        Set<Usuario> ordena1;
        Set<Usuario> ordena2;

        TestaComparator testacomparator = new TestaComparator();
        ordena1 = new TreeSet<Usuario>(new TestaComparator());
        ordena1.add(new Usuario("Neymar", "123", new Data(12, 07, 97)));
        ordena1.add(new Usuario("Huck", "456", new Data(11, 10, 96)));
        ordena1.add(new Usuario("Huck", "45678", new Data(11, 12, 95)));

        ordena2 = new TreeSet<Usuario>();
        ordena2.add(new Usuario("Neymar", "123", new Data(12, 07, 97)));
        ordena2.add(new Usuario("Huck", "456", new Data(11, 10, 96)));
        ordena2.add(new Usuario("Huck", "45678", new Data(11, 12, 95)));
    }
}
