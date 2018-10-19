package business.model;

public class Lab extends Sala{
    
    private int comp;

    public Lab(String nomeSala, InfraEstrutura infra, HorariosSala horario, boolean statusSala) {
        super(nomeSala, infra, horario, statusSala);
        
    }
    

    
    public int getCom(){
	return this.comp;

	}

    public void setCom(int comp){
	this.comp = comp; 

	}
}
