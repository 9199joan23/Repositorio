/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import modelo.Asignatura;
import modelo.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 9199.joan23
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el nombre del alumno1");
        String nombre = entrada.nextLine();

        System.out.println("Introduce el apellido del alumno1");
        String apellido = entrada.nextLine();
        /*
        System.out.println("Introduce la nota del alumno1");
        //double nota = entrada.nextDouble();

       // System.out.println("La nota es:" + nota);
       // String mensaje = entrada.nextLine();

        //Alumnos alumno1 = new Alumnos(nombre1,apellido1) ;
        */
        Asignatura asig1 = new Asignatura("Mates");

        System.out.println("Introduce la nota de mates del alumno 1");
        double notaMatesAl1 = entrada.nextDouble();

        asig1.setNota(notaMatesAl1);

        Asignatura asig2 = new Asignatura("Fisica");

        System.out.println("Introduce la nota de fisica del alumno 1");
        double notaFisicaAl1 = entrada.nextDouble();

        asig2.setNota(notaFisicaAl1);

        ArrayList<Asignatura> listaAsignatura = new ArrayList<Asignatura>();
        listaAsignatura.add(asig1);
        listaAsignatura.add(asig2);
        
        Alumnos alumno1 = new Alumnos(nombre, apellido, listaAsignatura);

        System.out.println(alumno1.toString());

        for (Asignatura aux : alumno1.getListasignatura()) {
            System.out.println("La asignatura "+aux.getNombreasig()+" tiene nota: "+aux.getNota());
        }
        /*
        //construtores por defecto
        Asignatura asig1 = new Asignatura();
        Asignatura asig2 = new Asignatura();
        //Dando valores
        
        asig1.setNombreasig("Mates");
        asig2.setNombreasig("Fisica");
  
        asig1.setNota(8);
        asig2.setNota(6);
       
        ArrayList<Asignatura> listaAsignatura1 = new ArrayList<Asignatura>();
       listaAsignatura1.add(asig1);
       listaAsignatura1.add(asig2);
        
        // Alumnos alumno1 = new Alumnos("Pol", "Garcia",listaAsignatura);
        //notas del alumno2
        
        asig1.setNota(3);
        asig2.setNota(5);
        
        
        ArrayList<Asignatura> listaAsignatura2 = new ArrayList<Asignatura>();
        
        Alumnos alumno2 = new Alumnos("Jaime", "Pepe",listaAsignatura1);
        
        ArrayList<Alumnos> listaAlumno = new ArrayList<Alumnos>();
       
            
        listaAlumno.add(alumno1);
        listaAlumno.add(alumno2);
         
        //recorrer el arraylist modo facil
        
            for (Alumnos aux : listaAlumno) {
            System.out.println(aux.getNombre() + " " + aux.getApellido());
            for (Asignatura aux1: aux.getListasignatura()){
                System.out.println("La nota de " +aux1.getNombreasig()+  " es " +aux1.getNota());
            }
        }
         */
    }

}
