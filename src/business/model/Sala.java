package business.model;

public abstract class Sala {
    private String nomeSala;
    private InfraEstrutura infra; 
    private HorariosSala horario;
    private boolean statusSala;
    private String tipoSala;

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
    
    public String getTipoSala(){
        return tipoSala;
    }

    public void setTipoSala(String tipoSala){
        this.tipoSala = tipoSala;
    }

    public String Status(boolean statusSala){
        if (this.statusSala == true)
            return "Disponível";
        else
            return "Ocupada";
    }
    
    @Override
    public String toString(){
        return "A sala" + this.nomeSala + "está " + this.Status(this.statusSala);
    }
}
