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

import com.proyect.helpers.ColaEstudiante;
import com.proyect.helpers.PilaEstudiante;
import com.proyect.models.Estudiantes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronald
 */
@WebServlet(name = "InscripcionCOntroller", urlPatterns = {"/InscripcionCOntroller"})
public class InscripcionCOntroller extends HttpServlet {

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
            String inscFlag = request.getParameter("hacerIncripcion");
            List<Estudiantes> listadoPila = new ArrayList();
            
            System.out.println(" el valor del flag es ::: " + inscFlag  );
            if( !inscFlag.isEmpty()  ){
                out.println("<p> los datos disponibles son PASALOS A LA COLA ! </p>");
                listadoPila = PilaEstudiante.getPila().exportarElementos();
                out.println("<ul>");
                    for(Estudiantes pila : listadoPila ){
                        out.println("<li> Carnet "+ pila.getCarnet()  + "</li><br>");
                        out.println("<li> nombre "+ pila.getNombre()  + "</li><br>");
                        out.println("<li> fNacimiento "+ pila.getFechaNacimiento()  + "</li><br>");
                    }
                out.println("</ul>");
                out.println("<a href='colaInscripcionDetalle.jsp'> Efectuar Operacion </a>");
  
                //RealizarIncripcion
            }
            
            /*
                REAL DOM-FORM
                <form action="CrearEstudiante" method="post">
                <input name="carnet" type="text" placeholder="Escribe el carnet">
                <br>
                <input name="nombre" type="text" placeholder="Escribe el nombre">
                <br>
                <input name="nacimiento" type="data" placeholder="Fecha de nacimiento">
                <br>
                <input type="submit" value="Registrar">
                </form>
            */
            
            
            //efecto del pop
            //PilaEstudiante.getPila().pop();
            
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
