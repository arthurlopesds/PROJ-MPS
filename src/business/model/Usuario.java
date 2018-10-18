package business.model;

import mapas.Data;

public class Usuario implements Comparable {

    private String login;
    String senha;
    Data data_nascimento;

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
