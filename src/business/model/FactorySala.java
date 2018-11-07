package business.model;

public class FactorySala {
    public Sala getSala(String nomeSala, InfraEstrutura infra, HorariosSala horario, boolean statusSala, String tipoSala){
 	if(tipoSala.equalsIgnoreCase("Auditorio"))
            return new Auditorio(nomeSala,infra,horario,statusSala);
 	else if(tipoSala.equalsIgnoreCase("Laboratorio"))
            return new Lab(nomeSala,infra,horario,statusSala);
	else if(tipoSala.equalsIgnoreCase("Sala de Aula"))
            return new SaladeAula(nomeSala,infra,horario,statusSala);
        return null;		
    }
}

