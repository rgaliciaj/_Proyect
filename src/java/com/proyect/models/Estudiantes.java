/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.models;

/**
 *
 * @author Ronald
 */
public class Estudiantes {
    private String carnet;
    private String nombre;
    private String fechaNacimiento;
    private Estudiantes siguiente;

    public Estudiantes(String carnet, String nombre, String fechaNacimiento) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

        public Estudiantes(String carnet, String nombre, String fechaNacimiento,Estudiantes siguiente) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.siguiente = siguiente;
    }
    

    public Estudiantes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Estudiantes siguiente) {
        this.siguiente = siguiente;
    }

    
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
