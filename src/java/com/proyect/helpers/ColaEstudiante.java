/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.helpers;

import com.proyect.models.Estudiantes;
import java.util.ArrayList;
import java.util.List;

import com.proyect.helpers.PilaEstudiante;

/**
 *
 * @author Ronald
 */
public class ColaEstudiante {
    private List<Estudiantes> auxCola = new ArrayList();
    private List<Estudiantes> auxColaData = new ArrayList();
    private static ColaEstudiante instancia;
    private Estudiantes ultimo;
    private Estudiantes eRaiz;
    private Estudiantes eFin;
    private int nElementos = 0;
     
    
     //propiedades de clase
     private String tempCarnet;
     private String tempNombre;
     private String tempNacimiento;
    
     
     public ColaEstudiante(){
         this.eRaiz = null;
         this.eFin = null;
         this.nElementos = 0;
     }
     
     
     public static ColaEstudiante getCola(){
         if( instancia == null ){
             instancia = new ColaEstudiante();
         }
         return instancia;
     }
     
     // PUSH
    public void push(String carnet, String nombre, String date){
        Estudiantes nuevo = new Estudiantes(carnet, nombre, date);
        if (this.eFin != null){
            this.eFin.setSiguiente(nuevo);
        }
        this.eFin = nuevo;
        if ( this.eRaiz == null){
            this.eRaiz = nuevo;
        }
        this.nElementos ++;
    }
    
       
    //POP
    public Estudiantes pop(){
        Estudiantes auxiliar = this.eRaiz;
        this.eRaiz = this.eRaiz.getSiguiente();
        auxiliar.setSiguiente(null);
        this.nElementos--;
        return auxiliar;
    }
     
     public void colaAsignacion(){
        this.auxCola = PilaEstudiante.getPila().exportarElementos();
        this.ultimo = this.auxCola.get( this.auxCola.size() -1 );
        this.tempCarnet = this.ultimo.getCarnet();
        this.tempNombre = this.ultimo.getNombre();
        this.tempNacimiento = this.ultimo.getFechaNacimiento();
        
        //llenar el array
        this.auxColaData
            .add(new Estudiantes(this.tempCarnet, this.tempNombre, this.tempNacimiento ));
        
        //quita el elemento del antiguo array
        PilaEstudiante.getPila().quitarUltimoElemento();
        
         System.out.println(" EL Ultimo carnet es ::: " + this.ultimo.getCarnet() );
         System.out.println(" EL Ultimo carnet es ::: " + this.ultimo.getNombre() );
         System.out.println(" EL ARRAY TIENE UNA ONGITUD DE :::" + this.auxColaData.size() );
     }
     
     public List<Estudiantes> exportDataCola(){
         return this.auxColaData;
     }
     
     
}
