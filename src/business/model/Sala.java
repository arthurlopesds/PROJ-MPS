package business.model;

public class Sala {
    private String nomeSala;
    //private InfraEstrutura infra; 
    //private HorariosSala horario;
    private boolean statusSala;

    public String getNumeroSala() {
        return nomeSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.nomeSala = numeroSala;
    }

    public boolean isStatusSala() {
        return statusSala;
    }

    public void setStatusSala(boolean statusSala) {
        this.statusSala = statusSala;
    }
    
    
}
