/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author 9199.joan23
 */
public class Alumnos {

    private String nombre;
    private String apellido;
    private ArrayList<Asignatura> Listasignatura;

    //constructor    

    public Alumnos(String nombre, String apellido, ArrayList<Asignatura> Listasignatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Listasignatura = Listasignatura;
    }

   

    public Alumnos() {
    }
  
   
 
//getter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Asignatura> getListasignatura() {
        return Listasignatura;
    }
   
    
//setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setListasignatura(ArrayList<Asignatura> Listasignatura) {
        this.Listasignatura = Listasignatura;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    public double mediaAritmetica(ArrayList<Asignatura>Listasignatura){
        double media=0;
       for(Asignatura  aux:Listasignatura){
       media = media+aux.getNota();
       }
       media=media/Listasignatura.size();
       return media;
    }
    
}
