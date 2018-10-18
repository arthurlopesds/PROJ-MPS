package business.model;

import java.text.SimpleDateFormat;

public class ReservaSala {
    private Sala sala;
    private Data data;
    private Hora hInicial;
    private Hora hFinal;
    private Usuario usuario;
    private String status; //aberta, recebida, aprovada, rejeitada, concluída, excluida

    public ReservaSala(Sala sala, Data data, Hora hInicial, Hora hFinal, Usuario usuario) {
        this.sala = sala;
        this.data = data;
        this.hInicial = hInicial;
        this.hFinal = hFinal;
        this.usuario = usuario;
        this.status = "aberta";
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Hora gethInicial() {
        return hInicial;
    }

    public void sethInicial(Hora hInicial) {
        this.hInicial = hInicial;
    }

    public Hora gethFinal() {
        return hFinal;
    }

    public void sethFinal(Hora hFinal) {
        this.hFinal = hFinal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String toString(){
        return "A reserva da Sala" + this.getSala().getNumeroSala() + " feita por " + this.getUsuario().getLogin() +
               ", para o dia " + this.getData() + " às " + this.gethInicial() + " à " + this.gethFinal() +
               ", se encontra em " + this.getStatus();
    }
}
