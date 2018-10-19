package business.model;

public class Auditorio extends Sala{
    
    private int poltronas;

    public Auditorio(String nomeSala, InfraEstrutura infra, HorariosSala horario, boolean statusSala) {
        super(nomeSala, infra, horario, statusSala);
        
    }
   
    public int getPoltronas(){
            return this.poltronas;
	}

	public void setPoltronas( int poltronas){
            this.poltronas = poltronas;
	}
}
