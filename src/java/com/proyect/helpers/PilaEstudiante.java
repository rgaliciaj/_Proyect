/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.helpers;
import com.proyect.models.Estudiantes;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JTextPane;

/**
 *
 * @author Ronald
 */
public class PilaEstudiante {
    private Estudiantes eRaiz;
    private int nElementos;
    private static PilaEstudiante instance;
    private List<Estudiantes> auxPila = new ArrayList();
    
    public static PilaEstudiante getPila(){
        if( instance == null){
            instance = new PilaEstudiante();
        }
        return instance;
    }
    
    public PilaEstudiante(){
        this.eRaiz = null;
        this.nElementos = 0;
    }
    
    public void push(String carnet, String nombre, String fechaNacimiento){
        Estudiantes nuevo = new Estudiantes(carnet,nombre, fechaNacimiento);
        this.auxPila.add( new Estudiantes( carnet, nombre, fechaNacimiento));
        System.out.println(" LO QUE ESTA ENTRANDO EN LA PILA ES ::::" + this.auxPila.size() );
        nuevo.setSiguiente(this.eRaiz);
        this.eRaiz = nuevo;
        this.nElementos++;
        
    }
    
    public Estudiantes pop(){
        Estudiantes auxiliar = this.eRaiz;
        this.eRaiz = this.eRaiz.getSiguiente();
        auxiliar.setSiguiente(null);
        this.auxPila.remove( this.auxPila.size() -1 );
        this.nElementos--;
        System.out.println(" LO QUE QUEDA EN LA PILA ES:::: " + this.auxPila.size() );
        return auxiliar;
    }
    
    public void verElementos(){
       Estudiantes aux;
       aux = this.eRaiz;
       
       for(Estudiantes es : this.auxPila ){
           System.out.println(" carnet  " + es.getCarnet() );
           System.out.println(" nombre  " + es.getNombre() );
       }       
    }
    
    public List<Estudiantes> exportarElementos(){
        return this.auxPila;
    }
    
    public void quitarUltimoElemento(){
        this.auxPila.remove( this.auxPila.size() -1 );
    }
    
    
}
