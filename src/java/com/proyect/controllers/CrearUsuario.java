/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyect.helpers.ListaUsuarios;
import com.proyect.models.Estudiantes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpSession;
import com.proyect.models.Usuarios;
import com.proyect.helpers.ListaUsuarios;

/**
 *
 * @author Ronald
 */
@WebServlet(name = "CrearUsuario", urlPatterns = {"/CrearUsuario"})
public class CrearUsuario extends HttpServlet {

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
             String nick = request.getParameter("user");
             String pass = request.getParameter("pass");
             List<Usuarios> dataRequest = new ArrayList();
             
                System.out.println("llegaron los params ;;;;" + nick + pass );
          
                ListaUsuarios.listaOrdenada().agregarUser(nick, pass);
                //data usuarios
                dataRequest = ListaUsuarios.listaOrdenada().exportUsers();
                
                out.println("<ul>");
                for(Usuarios s : dataRequest ){
                    out.println("<li> nickname : " + s.getNickName() + "</li><br> ");
                    out.println("<li> clave : " + s.getClave() + "</li> <br>");
                }
                out.println("</ul>");
                out.println("<a href='home.jsp' >Regresar al menu </a>");
                
                
                System.out.println("SE AGREGO UN SUARIO A TU LISTA ORDENADA");
                HttpSession session = request.getSession();
                session.setAttribute("success", "usuario creado con exito");
            
        
             
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
