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
public class Usuarios {
    private String nickName;
    private String clave;

    public Usuarios(String nickName, String clave) {
        this.nickName = nickName;
        this.clave = clave;
    }
        
    public Usuarios(){}
    
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
