package business.model;

public class Funcionario extends Usuario{
    private String cargo;

    public Funcionario(String login, String senha, Data data_nascimento, String cargo) {
        super(login, senha, data_nascimento);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void SolicitarReserva(String nomeSala, Data data, Hora hInicial, Hora hFinal, String login){
        // SolicitarReserva()
    }
    
    public String VisualizarStatusReserva(ReservaSala r){
        //return VisualizarStatus();
        return "";
    }
}
