package business.control;

import business.model.Data;
import business.model.Hora;
import business.model.ReservaSala;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ReservaControl {
    int i = 0;
    //Criar persistencia para as reservas
    LinkedList<ReservaSala> reservas = new LinkedList();
    LinkedList<ReservaSala> solicitacoes = new LinkedList();
    
    /*Solicitar reserva, criar reserva, alterar status da reserva */
    public void SolicitarReserva(String nomeSala, Data data, Hora hInicial, Hora hFinal, String login){
        solicitacoes.add(new ReservaSala(nomeSala, data, hInicial, hFinal, login));
        System.out.println("Sua solicitação foi feita com sucesso. Verifique o andamento da sua solicitação em Acompanhar Reserva.");
    }
    
    public void CriarReserva(){
        Iterator<ReservaSala> it = solicitacoes.iterator();
        while(!solicitacoes.isEmpty()){
            reservas.add(new ReservaSala(solicitacoes.element().getNomeSala(), solicitacoes.element().getData(), solicitacoes.element().gethInicial(),
                         solicitacoes.element().gethFinal(), solicitacoes.element().getLogin()));
            reservas.element().CriaId();
            solicitacoes.remove();
        }       
    }

    public void AlterarStatusR(){
        //
        Iterator<ReservaSala> it = solicitacoes.iterator();
    }
}
