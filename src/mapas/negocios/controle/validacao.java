package mapas.negocios.controle;

import mapas.negocios.modelo.Usuario;

public class validacao {

    public boolean validaLogin(Usuario u) {
        String login = u.getLogin();
        return login.matches("[a-z][A-Z]{1,15}");
    }

    public boolean validaSenha(Usuario u) {
        String senha = u.getSenha();
        return senha.matches("(^|$)[a-z]+(^|$)[0-9]{1,}");
    }
}
