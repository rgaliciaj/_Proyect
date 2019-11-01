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

import com.proyect.helpers.PilaEstudiante;
import javax.servlet.RequestDispatcher;
import com.proyect.models.Estudiantes;
import java.util.ArrayList;
import java.util.List;
import java.util.*; 

/**
 *
 * @author Ronald
 */
@WebServlet(name = "CrearEstudiante", urlPatterns = {"/CrearEstudiante"})
public class CrearEstudiante extends HttpServlet {
    
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
            String carnet = request.getParameter("carnet");
            String nombre = request.getParameter("nombre");
            String nacimiento = request.getParameter("nacimiento");
            List<Estudiantes> dataRequest = new ArrayList();
            
            
            PilaEstudiante.getPila().push(carnet, nombre, nacimiento);
            System.out.println("ESTUDIANTE CREADO CORRECTAMENTE");
            PilaEstudiante.getPila().verElementos();
            
            
            //datos a pasar por el foreach
            dataRequest = PilaEstudiante.getPila().exportarElementos();
            request.setAttribute("list_data", dataRequest);
            
            System.out.println("-*********************************************");
            System.out.println(" la data del array es::: " + dataRequest.size());
            System.out.println("-*********************************************");
             
            
            //Impresion local
            
            out.println("<p> Estudiantes en la pila </p");
            out.println("<ul>");
            Collections.reverse(dataRequest);
            for(Estudiantes e : dataRequest ){
                out.println("<li> carnet : " + e.getCarnet() + "</li><br> ");
                out.println("<li> nombre : " + e.getNombre() + "</li> <br>");
                out.println("<li> fechaNacimiento : " + e.getFechaNacimiento() + "</li><br>");
            }
            out.println("</ul>");
            out.println("<a href='home.jsp' >Regresar al menu </a>");
            
             
            String incripcionView = "colaInscripcion.jsp";
            RequestDispatcher dispacher = getServletContext()
                    .getRequestDispatcher(incripcionView);
            
            dispacher.forward(request,response);
            
            
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
