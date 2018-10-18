package business.model;

import java.io.Serializable;
import mapas.Data;

public class Usuario implements Comparable, Serializable {

    private String login;
    private String senha;
    private Data data_nascimento;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String login, String senha, Data data_nascimento) {
        this.login = login;
        this.senha = senha;
        this.data_nascimento = data_nascimento;
    }

    @Override
    public int compareTo(Object o) {
        return this.login.compareTo(((Usuario) o).getLogin());
    }
}
