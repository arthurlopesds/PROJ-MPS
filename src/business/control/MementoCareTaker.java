/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import java.util.HashMap;

/**
 *
 * @author arthur
 */
public class MementoCareTaker {
    protected UsuarioMemento usuario;
    
    public MementoCareTaker(){
        usuario = new UsuarioMemento(new HashMap<>());
    }

    public  void addMemento(UsuarioMemento usuarioMemento){
        this.usuario = usuarioMemento;
    }

    public UsuarioMemento getUltimoEstadoSalvo(){
        return usuario;
    }
}
