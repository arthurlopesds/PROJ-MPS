/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;
import business.model.Usuario;
import java.util.HashMap;

/**
 *
 * @author arthur
 */
public class UsuarioMemento {
    HashMap <String,Usuario> usuario;
    
    public UsuarioMemento(HashMap<String,Usuario> usuario){
        this.usuario = usuario;
    }
    
    public HashMap<String,Usuario> getEstadoSalvo(){
        return usuario;
    }
}
