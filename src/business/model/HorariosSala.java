/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author Yure
 */
public class HorariosSala {
    private Data date;
    private String[][] aula = new String[8][6];
    private Hora hora;

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public String[][] getAula() {
        return aula;
    }

    public void setAula(String[][] aula) {
        this.aula = aula;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public void PrintHorario(){

        for (int i=0; i<this.aula.length;i++){
            for(int j=0; j<this.aula.length;j++){
		System.out.print(this.aula[j][i]+" - ");
}
        System.out.println();
}

        
}

    
    
    
}
