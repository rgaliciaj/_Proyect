/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.helpers;
import com.proyect.models.Usuarios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class ListaUsuarios {
    private static ListaUsuarios instance;
    private List<Usuarios> listaUsuarios = new ArrayList();
    
    //informacion comodin
    private String comodinNickname = "progra2";
    private String comodinPassword = "umg123";
    
    public static ListaUsuarios listaOrdenada(){
        if( instance == null ){
            instance = new  ListaUsuarios();
        }
        return instance;
    }
    
    public String authUsers(String n, String p ){
        String resLogin = "";
        this.listaUsuarios
            .add( new Usuarios( this.comodinNickname, this.comodinPassword));
        for( Usuarios u : this.listaUsuarios ){
            String tempNick = u.getNickName();
            String tempPass = u.getClave();
            if( tempNick.equals( n) && tempPass.equals( p)){
                resLogin = "si";
                break;
            }
            resLogin = "no";
            
        }
        return resLogin;
    }
    
    public void agregarUser(String n, String p){
        this.listaUsuarios.add(new Usuarios(n, p ));
    }
    
    public int getIdUserLoged(String nombreUsuario){
        System.out.println("esta llegando dentro del metodo **************************************");
        System.out.println(" EL NOBRE DEL NICK PASADO ES :::  "+ nombreUsuario );
        int respIdFind = 0;
        for(int i=0; i < this.listaUsuarios.size(); i++ ){
            System.out.println("estos son los ids :"+ i ++ );
            System.out.println("estos son los nombres:" + this.listaUsuarios.get(i).getNickName());
            
            if( this.listaUsuarios.get(i).getNickName().equals(nombreUsuario) ){
                System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° SI EXISTE ESTE USUARIO");
                System.out.println("e ID QUE PERTENECE A ESTE USUARIO ES::" + i );
            }
           
        }
        return respIdFind;
    }
    
    public List<Usuarios> exportUsers(){
        return this.listaUsuarios;
    }
    
    
}
