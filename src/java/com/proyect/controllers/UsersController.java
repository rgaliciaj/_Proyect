/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//buscar el modelo de usuario en su directorio
import com.proyect.models.Users;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ronald Galicia
 */
@WebServlet(name = "UsersController", urlPatterns = {"/UsersController"})
public class UsersController extends HttpServlet {
    private String tempUsername = "";
    private String tempPass = "";
    private ArrayList<Users> arrayUsers = new ArrayList();
    //creacion de admin dummy
    private String dummyUsername = "progra2";
    private String dummyPass = "umg123";
    //esta variable contendra el valor del login sea (true/false)
    private Boolean statusLogin = false;
   //declaracion global de la session
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           this.tempUsername = request.getParameter("user");
           this.tempPass = request.getParameter("pass");
           
            //creacion de sessiones
            HttpSession session = request.getSession();
            session.setAttribute("username", this.tempUsername);
                
            this.statusLogin = this.login(this.tempUsername, this.tempPass);
            if( this.statusLogin == true ){
                response.sendRedirect("home.jsp");
            }else{
                response.sendRedirect("index.html");
                //alert de usuario y pass incorrectos
            }
            //System.out.println(" EL VALOR QUE VIENE EN ELLOGIN ES ;;;; "+ this.statusLogin );
            
        }
    }
    
    public Boolean login(String usernameLogin, String passwordLogin){
        Boolean tempStatus = false;
        this.arrayUsers.add(new Users(this.dummyUsername, this.dummyPass));
        for(int i=0; i < this.arrayUsers.size(); i++ ){
            String dataArrayUsername = this.arrayUsers.get(i).getUsername();
            String dataArrayPassword = this.arrayUsers.get(i).getPassword();
            //System.out.println("llegaste fuera del iffffffffffffffffffffffff");
           if( ( dataArrayUsername.equals(usernameLogin)) 
            && ( dataArrayPassword.equals(passwordLogin))){
               tempStatus = true;
               break;
           }else{
               tempStatus = false;
           }
            
        }
        return tempStatus;
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
       
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
  
        HttpSession session = request.getSession();
       session.invalidate();
               
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
