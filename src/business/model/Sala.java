package business.model;

public class Sala {
    private String nomeSala;
    private InfraEstrutura infra; 
    private HorariosSala horario;
    private boolean statusSala;

    public Sala(String nomeSala, InfraEstrutura infra, HorariosSala horario, boolean statusSala) {
        this.nomeSala = nomeSala;
        this.infra = infra;
        this.horario = horario;
        this.statusSala = statusSala;
    }
    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public boolean isStatusSala() {
        return statusSala;
    }

    public void setStatusSala(boolean statusSala) {
        this.statusSala = statusSala;
    }   
    
    
}
