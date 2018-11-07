package view;

import java.util.*;
import business.model.Data;
import business.control.UsuarioControl;
import mapas.TestaComparator;
import business.model.Usuario;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {

        UsuarioControl op = new UsuarioControl();
        TestaComparator tc = new TestaComparator();

        Usuario user1 = new Usuario("Neymar", "123", new Data(12, 01, 97));
        Usuario user2 = new Usuario("Huck", "456", new Data(12, 04, 92));
        Usuario user3 = new Usuario("Cassio", "789", new Data(15, 03, 90));
        
        //STRATEGY
        Contexto context = new Contexto(new LoginContaApp());
        System.out.println("Conta APP: " + context.realizaLogin(1));
        
        context = new Contexto(new LoginSIGAA());
        System.out.println("Conta SIGAA " + context.realizaLogin(2));
    }
}
