package business.control;

import business.model.Usuario;

public class Validacao {
    public static boolean validaUsuario(Usuario u) throws LoginException, PassException {
        boolean login = validaLogin(u);
        boolean pass = validaSenha(u);
        return (login && pass);
    }

    public static boolean validaLogin(Usuario u) throws LoginException {
        String login = u.getLogin();
        if(login.isEmpty())
            throw new LoginException(u, "Não é permitido login vazio");
        if(!login.matches("[a-z][A-Z]{1,15}"))
            throw new LoginException(u, "Login inválido.");
        return login.matches("[a-z][A-Z]{1,15}");
    }

    public static boolean validaSenha(Usuario u) throws PassException {
        String senha = u.getSenha();
        if(senha.length() < 6 || senha.length() > 16)
            throw new PassException("Sua senha deve ter no mínimo 6 e no máx 16 caracteres.");
        if(!senha.matches("(^|$)[a-z]+(^|$)[0-9]{1,}"))
            throw new PassException("Senha inválida");
        return senha.matches("(^|$)[a-z]+(^|$)[0-9]{1,}");
    }
}
