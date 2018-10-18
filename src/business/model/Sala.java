package business.model;

public class Sala {
    private String numeroSala;
    //private InfraEstrutura infra; 
    //private HorariosSala horario;
    private boolean statusSala;

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isStatusSala() {
        return statusSala;
    }

    public void setStatusSala(boolean statusSala) {
        this.statusSala = statusSala;
    }
    
    
}
