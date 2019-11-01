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
import com.proyect.helpers.ListaUsuarios;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ronald
 */
@WebServlet(name = "UsuariosController", urlPatterns = {"/UsuariosController"})
public class UsuariosController extends HttpServlet {

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
            String nickName = request.getParameter("nick");
            String pass = request.getParameter("pass");
            
            String estado = ListaUsuarios
                .listaOrdenada().authUsers(nickName, pass);
            
            //Session configuracion
            HttpSession session = request.getSession();
            session.setAttribute("user", nickName);
            
            
            if( estado == "si" ){
                /*int idUser = ListaUsuarios
                        .listaOrdenada()
                        .getIdUserLoged(nickName);
                System.out.println(" EL ID DEL USUARIO LOGEADO ES:::" +idUser );
                System.out.println(" EL ID DE LA SESSION ES:::" + session.getId() );
                session.setAttribute("idUsuario", idUser);*/
                
                RequestDispatcher view = request
                    .getRequestDispatcher("home.jsp");      
                view.forward(request, response);
            }else{
                RequestDispatcher view = request
                    .getRequestDispatcher("index.jsp");      
                view.forward(request, response);
            }
            
            //Crear un nuevo estudiante
            // String addUser = request.getParameter("reg");
            // System.out.println("ESTAS CREANDO UN NUEVO ESTUDIANTE:::::::::::::::::" + addUser );
          
                      
        }
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
        
        String logOut = request.getParameter("outSession");
        String addNewUser = request.getParameter("reg");
        
        if( logOut == "out" ){
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("index.jsp");
        }
        
        //System.out.println("EL VALOR DEL NEW USER ES::::::::"+ addNewUser );
        
        if( addNewUser == "newUser" ){
            System.out.println("llegasdesdentor del controlador y el medodo=============0000");
             RequestDispatcher view = request
                    .getRequestDispatcher("form-usuario.jsp");      
                view.forward(request, response);
        }
       
        
        
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
