package business.model;

public class FuncCoordenacao extends Funcionario {
    
    public FuncCoordenacao(String login, String senha, Data data_nascimento, String cargo) {
        super(login, senha, data_nascimento, cargo);
    }
    
    public void VisualizarSolicitacoes(){
        //percorre a lista de solicitações e cria as reservas
    }
    
    public void CriarReserva(){}
    
    public void AlterarReserva(){}
}
