/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 9199.joan23
 */
public class Asignatura {

    private String nombreasig;
    private double nota;

//Constructores
    public Asignatura(String nombreasig, double nota) {
        this.nombreasig = nombreasig;
        this.nota = nota;
    }

    public Asignatura(String nombreasig) {
        this.nombreasig = nombreasig;
    }

    public Asignatura() {
    }

//getter

    public String getNombreasig() {
        return nombreasig;
    }

    public double getNota() {
        return nota;
    }
 

// Setter    

    public void setNombreasig(String nombreasig) {
        this.nombreasig = nombreasig;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
   
}
