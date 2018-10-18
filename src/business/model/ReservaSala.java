package business.model;

import java.text.SimpleDateFormat;

public class ReservaSala {
    private static int sequence = 0;
    private int id;
    private String nomeSala;
    private Data data;
    private Hora hInicial;
    private Hora hFinal;
    private String login;
    private String status; //aberta, recebida, aprovada, rejeitada, concluída, excluida

    public ReservaSala(String nomeSala, Data data, Hora hInicial, Hora hFinal, String login) {
        this.nomeSala = nomeSala;
        this.data = data;
        this.hInicial = hInicial;
        this.hFinal = hFinal;
        this.login = login;
        this.status = "aberta";
    }

    public int getId() {
        return id;
    }

    public void CriaId() {
        this.id = sequence++;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String toString(){
        return "A reserva da Sala" + this.getNomeSala() + " feita por " + this.getLogin() +
               ", para o dia " + this.getData() + " às " + this.gethInicial() + " à " + this.gethFinal() +
               ", se encontra em " + this.getStatus();
    }
}
