package business.model;

public class SaladeAula extends Sala{
    
    private boolean quadro;

    public SaladeAula(String nomeSala, InfraEstrutura infra, HorariosSala horario, boolean statusSala) {
        super(nomeSala, infra, horario, statusSala);
        
    }
    
    
    
    public boolean getQuadro(){
	return this.quadro;
	}

    public void setQuadro( boolean quadro){
	this.quadro = quadro;

	}
}
