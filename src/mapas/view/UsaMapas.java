/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas.view;

import java.util.*;
import mapas.Data;
import mapas.negocios.controle.GerenciaMapa;
import mapas.TestaComparator;
import mapas.negocios.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author arthu
 */
public class UsaMapas {

    public static void insereMapa(HashMap m, Usuario u) {
        m.put(u.getLogin(), u);
    }

    public static void editarMapa(Map m, Usuario u) {
    }

    public static void main(String[] args) {

        GerenciaMapa op = new GerenciaMapa();
        TestaComparator tc = new TestaComparator();

        Usuario user1 = new Usuario("Neymar", "123", new Data(12, 01, 97));
        Usuario user2 = new Usuario("Huck", "456", new Data(12, 04, 92));
        Usuario user3 = new Usuario("Cassio", "789", new Data(15, 03, 90));

        Map<String, Usuario> hm = new HashMap<String, Usuario>();
        op.insereMapa(hm, user1);
        op.insereMapa(hm, user2);
        op.insereMapa(hm, user3);

        GerenciaMapa.printUsuario(hm);

        /**
         * ************************************************
         */
        Map<String, Usuario> tm = new TreeMap<String, Usuario>();
        op.insereMapa(tm, user1);
        op.insereMapa(tm, user2);
        op.insereMapa(tm, user3);

    }

}